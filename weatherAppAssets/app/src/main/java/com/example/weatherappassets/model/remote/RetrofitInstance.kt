package com.example.weatherappassets.model.remote
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInstance {

    private val retrofit = Retrofit.Builder()
        .baseUrl(CityService.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val cityService : CityService by lazy { retrofit.create() }
}