package com.example.feature_favorite
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.feature_favorite.adapter.MediaItemsAdapter
import com.example.feature_favorite.adapter.viewholder.MediaItemViewHolder
import com.example.feature_favorite.databinding.FragmentFavoriteBinding
import com.example.feature_favorite.util.ViewState
import com.example.feature_favorite.viewmodel.FavoritesViewModel
import com.example.omdb.response.FavoriteMediaItem
import com.google.android.material.snackbar.Snackbar

class FavoriteFragment : Fragment(), MediaItemViewHolder.OnItemClickListener {
    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<FavoritesViewModel>()
    private val mediaItemsAdapter by lazy { MediaItemsAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentFavoriteBinding.inflate(inflater, container, false).also {
        _binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initObservers()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun initViews() = with(binding) {
        rvResults.adapter = mediaItemsAdapter

        btnClear.setOnClickListener {
            viewModel.deleteFavList()
            Snackbar.make(binding.root, "Cleared Favorite List",800).show()
        }
    }
    private fun initObservers() = with(viewModel) {
        faves.observe(viewLifecycleOwner) { list ->
           mediaItemsAdapter.submitList(list)
        }
    }
    override fun onItemClick(item: FavoriteMediaItem) {
        viewModel.deleteItem(item.imdbID)
        Snackbar.make(binding.root, "Deleted Movie from Favorite list", 800).show()
    }

}