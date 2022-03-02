package com.example.feature_search.model.response


import com.google.gson.annotations.SerializedName

data class MediaItem(
    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val year: String,
    val imdbID: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Poster")
    val poster: String
)