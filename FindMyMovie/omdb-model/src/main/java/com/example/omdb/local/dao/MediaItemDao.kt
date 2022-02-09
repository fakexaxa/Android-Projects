package com.example.omdb.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.omdb.response.MediaItem
import kotlinx.coroutines.flow.Flow

@Dao
interface MediaItemDao {

    @Query("SELECT * FROM media_item")
    fun getAll(): Flow<List<MediaItem>>

    @Query("DELETE  FROM media_item")
    fun deleteMediaItems()

    @Insert
    suspend fun insertAll(vararg users: MediaItem)

    @Insert
    suspend fun insertItem(users: MediaItem)


    @Delete
    suspend fun delete(user: MediaItem)
}