package com.example.feature_search.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_search.model.OmdbRepo
import com.example.feature_search.model.response.MediaItem
import com.example.feature_search.model.response.SearchResponse
import com.example.feature_search.util.ViewState
import kotlinx.coroutines.launch

class SearchViewModel constructor(
    private val omdbRepo: OmdbRepo
) : ViewModel() {

    private val _viewState = MutableLiveData<ViewState>(ViewState.NoQuery)
    val viewState: LiveData<ViewState> get() = _viewState

    var query: String = ""
        set(value) {
            when (value.length) {
                0 -> _viewState.value = ViewState.NoQuery
                in 1 until 3 -> _viewState.value = ViewState.Failure.InvalidQuery
                else -> if (query != value) searchForMediaItems(value)
            }
            field = value
        }

    internal fun searchForMediaItems(query: String) {
        _viewState.value = ViewState.Loading

        viewModelScope.launch {
            val result: Result<SearchResponse> = omdbRepo.searchByQuery(query)

            val exception: String? = result.exceptionOrNull()?.message
            val mediaItems: List<MediaItem>? = result.getOrNull()?.search

            _viewState.value = when {
                mediaItems?.isEmpty() == true -> ViewState.Failure.NoMediaItemsFound
                mediaItems.isNullOrEmpty() -> {
                    if (exception != null) ViewState.Failure.WhileFetching(exception)
                    else ViewState.Failure.SomethingWentWrong
                }
                else -> ViewState.Success(mediaItems)
            }
        }
    }
}