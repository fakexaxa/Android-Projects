package com.example.weatherappassets.model
import com.example.weatherappassets.model.remote.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object CityRepo {

    private val cityService by lazy { RetrofitInstance().cityService }

    suspend fun getCityData(search: String) = withContext(Dispatchers.IO) {
       cityService.getCityFiles(search)
    }

    suspend fun getWeatherData(id: Int) = withContext(Dispatchers.IO) {
        cityService.getWeatherData(id)
    }

}