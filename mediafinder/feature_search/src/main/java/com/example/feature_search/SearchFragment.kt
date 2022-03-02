package com.example.feature_search

import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.doOnLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.feature_search.adapter.MediaItemsAdapter
import com.example.feature_search.databinding.FragmentSearchBinding
import com.example.feature_search.di.DaggerAppComponent
import com.example.feature_search.model.response.MediaItem
import com.example.feature_search.util.*
import com.example.feature_search.viewmodel.SearchViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import javax.inject.Inject

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var viewModel: SearchViewModel
    private val mediaItemsAdapter by lazy { MediaItemsAdapter(::mediaClicked) }
    private lateinit var behavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        initDagger()
        super.onCreate(savedInstanceState)
    }

    private fun initDagger() {
            DaggerAppComponent.builder().context(requireContext()).build().inject(this)
    }

    private val backCallback by lazy {
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, false) {
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    private val queryTextListener =
        object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) viewModel.query = query
                hideKeyboard()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                binding.tvNoQuery.isVisible = mediaItemsAdapter.itemCount < 1
                return true
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSearchBinding.inflate(inflater, container, false).also {
        _binding = it
        initBottomSheet()
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObservers()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun mediaClicked(mediaItem: MediaItem)= with(binding) {
        loadMediaItem(mediaItem)
        behavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    private fun initBottomSheet() = with(binding.bottomSheet) {
        behavior = BottomSheetBehavior.from(lessonsSheet)

        svQuery.run { clearFocus();setOnQueryTextListener(queryTextListener) }

        collapseSearch.setOnClickListener { behavior.state = BottomSheetBehavior.STATE_COLLAPSED }

        sheetExpand.setOnClickListener { behavior.state = BottomSheetBehavior.STATE_EXPANDED }

        with(rvResults) {
            setHasFixedSize(true)
            adapter = mediaItemsAdapter
        }

        val sheetStartColor = themeColor(androidx.appcompat.R.attr.colorPrimary)
        val sheetEndColor = getColorStateList(R.color.primary_sheet).defaultColor
        val sheetBackground = ShapeAppearanceModel
            .builder(context, R.style.ShapeAppearance_MinimizedSheet, 0)
            .build()
            .let { model -> MaterialShapeDrawable(model) }
            .apply { fillColor = ColorStateList.valueOf(sheetStartColor) }

        with(lessonsSheet) {
            background = sheetBackground

            doOnLayout { view ->
                val peek = behavior.peekHeight
                val maxTranslationX = view.width.minus(peek).toFloat()
                translationX = width.minus(peek).toFloat()

                val bottomSheetCallback = object : BottomSheetBehavior.BottomSheetCallback() {
                    override fun onStateChanged(bottomSheet: View, newState: Int) {
                        backCallback.isEnabled = newState == BottomSheetBehavior.STATE_EXPANDED
                    }

                    override fun onSlide(bottomSheet: View, slideOffset: Float) {
                        translationX = lerp(
                            startValue = maxTranslationX,
                            endValue = 0f,
                            startFraction = 0f,
                            endFraction = 0.15f,
                            fraction = slideOffset
                        )
                        sheetBackground.interpolation = lerp(
                            startValue = 1f,
                            endValue = 0f,
                            startFraction = 0f,
                            endFraction = 0.15f,
                            fraction = slideOffset
                        )
                        sheetBackground.fillColor = ColorStateList.valueOf(
                            lerpArgb(
                                startColor = sheetStartColor,
                                endColor = sheetEndColor,
                                startFraction = 0f,
                                endFraction = 0.3f,
                                fraction = slideOffset
                            )
                        )
                        searchIcon.alpha = lerp(
                            startValue = 1f,
                            endValue = 0f,
                            startFraction = 0f,
                            endFraction = 0.15f,
                            fraction = slideOffset
                        )
                        sheetExpand.alpha = lerp(
                            startValue = 1f,
                            endValue = 0f,
                            startFraction = 0f,
                            endFraction = 0.15f,
                            fraction = slideOffset
                        )
                        sheetExpand.isVisible = slideOffset < 0.5
                        collapseSearch.alpha = lerp(
                            startValue = 0f,
                            endValue = 1f,
                            startFraction = 0.2f,
                            endFraction = 0.8f,
                            fraction = slideOffset
                        )
                        rvResults.alpha = lerp(
                            startValue = 0f,
                            endValue = 1f,
                            startFraction = 0.2f,
                            endFraction = 0.8f,
                            fraction = slideOffset
                        )
                    }
                }
                if (mediaItemsAdapter.itemCount == 0) behavior.state =
                    BottomSheetBehavior.STATE_EXPANDED
                behavior.addBottomSheetCallback(bottomSheetCallback)

                doOnApplyWindowInsets { _, insets, _, _ ->
                    val newInsets = insets.getInsets(WindowInsetsCompat.Type.navigationBars())
                    behavior.peekHeight = peek.plus(newInsets.bottom)
                }
            }
        }
    }

    private fun initObservers() = with(viewModel) {
        viewState.observe(viewLifecycleOwner) { state ->
            binding.loading.isVisible = state is ViewState.Loading
            binding.tvNoQuery.isVisible = state !is ViewState.Success
            if (state is ViewState.Success) {
                mediaItemsAdapter.submitList(state.mediaItems)
                loadMediaItem(state.mediaItems[0])
            }
            if (state is ViewState.Failure) handleError(state)
        }
    }
    private fun loadMediaItem(mediaItem: MediaItem){
        binding.ivMediaImage.load(mediaItem.poster) {
            scale(Scale.FIT)
            crossfade(true)
            crossfade(500)
            placeholder(com.example.findmymovie.R.drawable.no_image)
            transformations(RoundedCornersTransformation(25f))
            build()
        }
        binding.tvTitle.text=mediaItem.title
    }

    private fun handleError(state: ViewState.Failure) {
        val errorMsg = when (state) {
            is ViewState.Failure.NoMediaItemsFound -> "NoMediaItemsFound"
            is ViewState.Failure.SomethingWentWrong -> "SomethingWentWrong"
            is ViewState.Failure.InvalidQuery -> "InvalidQuery"
            is ViewState.Failure.WhileFetching -> state.exception
        }
        Log.d("SearchFragment", "handleError: $errorMsg")
    }
}