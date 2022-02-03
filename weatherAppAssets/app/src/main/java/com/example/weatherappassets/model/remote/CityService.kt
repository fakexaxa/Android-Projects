package com.example.weatherappassets.model.remote

import com.example.weatherappassets.model.response.citydata.CityDataFile
import com.example.weatherappassets.model.response.weatherdata.WeatherData
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CityService {

    companion object{
        const val BASE_URL="https://weather.exam.bottlerocketservices.com"
    }

    @GET("/cities/")
    suspend fun getCityFiles(
        @Query("search") search: String
    ) : CityDataFile

    @GET("/cities/{cityId}")
    suspend fun getWeatherData(
        @Path("cityId") cityId : Int
    ): WeatherData
}