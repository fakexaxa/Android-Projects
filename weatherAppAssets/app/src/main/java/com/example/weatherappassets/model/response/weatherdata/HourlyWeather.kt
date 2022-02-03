package com.example.weatherappassets.model.response.weatherdata

data class HourlyWeather(
    val hour: Int,
    val humidity: Double,
    val rainChance: Double,
    val temperature: Int,
    val weatherType: String,
    val windSpeed: Double
)