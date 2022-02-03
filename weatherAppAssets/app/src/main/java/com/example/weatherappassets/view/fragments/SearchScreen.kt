package com.example.weatherappassets.view.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.weatherappassets.R
import com.example.weatherappassets.databinding.FragmentMainscreenBinding
import com.example.weatherappassets.databinding.FragmentSearchscreenBinding
import com.example.weatherappassets.model.CityRepo
import com.example.weatherappassets.modelview.CityViewModel
import kotlinx.coroutines.launch

class SearchScreen : Fragment(R.layout.fragment_searchscreen) {

    private var _binding: FragmentSearchscreenBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<CityViewModel>()


    val TAG = "SearchScreen"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSearchscreenBinding.inflate(inflater, container, false).also {
        _binding = it

    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {

        with(binding) {
            ivSearch.setOnClickListener {
                val cityName = etCityName.text.toString()
                val action = SearchScreenDirections.actionSearchScreenToMainScreen(message = cityName)
                findNavController().navigate(action)
            }
        }
    }
}