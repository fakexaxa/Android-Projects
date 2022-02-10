package com.example.omdb.local.dao

import androidx.room.*
import com.example.omdb.response.FavoriteMediaItem
import com.example.omdb.response.MediaItem
import kotlinx.coroutines.flow.Flow

@Dao
interface FavoriteItemDao {

    @Query("SELECT * FROM favorite_list")
    fun getAll(): Flow<List<FavoriteMediaItem>>

    @Query("DELETE  FROM favorite_list")
    fun deleteMediaItems()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: FavoriteMediaItem)

    @Delete
    suspend fun delete(user: FavoriteMediaItem)

    @Query("SELECT Title,Year,imdb_id,Type,Poster FROM media_item WHERE imdb_id=:id")
   suspend fun getMediaItem(id: String): FavoriteMediaItem

    @Query("DELETE  FROM favorite_list")
    suspend fun deleteAllFavMediaItems()

    @Query("DELETE  FROM favorite_list WHERE imdb_id=:id")
    suspend fun deleteItem(id: String)


}