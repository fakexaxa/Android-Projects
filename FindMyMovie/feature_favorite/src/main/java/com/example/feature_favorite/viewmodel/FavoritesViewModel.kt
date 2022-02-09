package com.example.feature_favorite.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.feature_favorite.util.ViewState
import com.example.omdb.OmdbRepo
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch

class FavoritesViewModel(app: Application) : AndroidViewModel(app) {


    private val omdbRepo by lazy { OmdbRepo(getApplication()) }

    val faves = omdbRepo.favMediaItems.asLiveData()

    fun deleteFavList() {
        viewModelScope.launch {
            omdbRepo.deleteFavList()
        }
    }
    fun deleteItem(id: String){
        viewModelScope.launch {
            omdbRepo.deleteItem(id)
        }
    }


}