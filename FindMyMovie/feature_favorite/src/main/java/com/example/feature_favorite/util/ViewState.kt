package com.example.feature_favorite.util
import com.example.omdb.response.FavoriteMediaItem

sealed class ViewState {

    data class Success(val favMediaItems: List<FavoriteMediaItem>) : ViewState()

    sealed class Failure : ViewState() {
        data class WhileFetching(val exception: String) : Failure()
        object InvalidQuery : Failure()
        object NoMediaItemsFound : Failure()
        object SomethingWentWrong : Failure()
    }
}
