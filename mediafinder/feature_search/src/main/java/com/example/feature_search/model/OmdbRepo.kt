package com.example.feature_search.model
import com.example.feature_search.model.remote.OmdbService
import com.example.feature_search.model.response.SearchResponse
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton


class OmdbRepo constructor(
    private val service: OmdbService
) {

    suspend fun searchByQuery(
        query: String
    ): Result<SearchResponse> = withContext(Dispatchers.IO) {
        return@withContext try {
            val searchResponse = service.searchByQuery(query)
            Result.success(searchResponse.body()!!)
        } catch (ex: Exception) {
            Result.failure(ex)
        }
    }
}