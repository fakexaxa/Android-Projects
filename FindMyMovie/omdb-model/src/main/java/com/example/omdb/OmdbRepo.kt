package com.example.omdb

import android.app.Application
import android.util.Log
import com.example.omdb.local.OmdbDatabase
import com.example.omdb.remote.OmdbService
import com.example.omdb.response.FavoriteMediaItem
import com.example.omdb.response.MediaItem
import com.example.omdb.response.SearchResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

/**
 * Using object makes this instance a Singleton Class, which means only 1 instance of this class will ever exist
 */
class OmdbRepo(app: Application) {

    private val mediaItemDao by lazy { OmdbDatabase.getInstance(app).mediaItemDao() }
    val mediaItems: Flow<List<MediaItem>> = mediaItemDao.getAll()

     private val favMediaItemDao by lazy { OmdbDatabase.getInstanceFavorites(app).favoriteItemDao() }
      val favMediaItems: Flow<List<FavoriteMediaItem>> = favMediaItemDao.getAll()



    /**
     * suspend -> makes this a coroutine function so we can move its operations to another thread
     * withContext -> part of coroutines we use this to change the Thread
     * Dispatchers -> Use this to select the thread
     *
     * This method uses OMDB Service instance to fetch for media item relating to the query passed in
     */
    suspend fun searchByQuery(
        query: String
    ): Result<SearchResponse> = withContext(Dispatchers.IO) {
        return@withContext try {
            val response = OmdbService.instance.searchByQuery(query)
            val searchResponse = response.body()!!
            mediaItemDao.deleteMediaItems()
            mediaItemDao.insertAll(*searchResponse.search.toTypedArray())
            Result.success(searchResponse) // return success if there's a body(SearchResponse)
        } catch (ex: Exception) {
            Result.failure(ex) // return failure, means call failed or body was null
        }
    }
     suspend fun addItemToFavorites(id: String)= withContext(Dispatchers.IO){

        val movie= favMediaItemDao.getMediaItem(id)
         favMediaItemDao.insertItem(movie)

    }
     suspend fun deleteFavList(){
        favMediaItemDao.deleteAllFavMediaItems()
    }
    suspend fun deleteItem(id: String){
        favMediaItemDao.deleteItem(id)
    }






}