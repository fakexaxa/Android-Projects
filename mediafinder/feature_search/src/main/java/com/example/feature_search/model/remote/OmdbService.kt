package com.example.feature_search.model.remote
import com.example.feature_search.model.response.SearchResponse
import com.example.feature_search.util.Keys.KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OmdbService {

    @GET(".")
    suspend fun searchByQuery(
        @Query("s") query: String,
        @Query("apikey") apiKey: String = KEY
    ): Response<SearchResponse>

}
