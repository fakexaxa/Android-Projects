package com.example.omdb.response
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "favorite_list")
data class FavoriteMediaItem(
    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: String,
    @PrimaryKey
    @ColumnInfo(name = "imdb_id")
    var imdbID: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Poster")
    val poster: String
)