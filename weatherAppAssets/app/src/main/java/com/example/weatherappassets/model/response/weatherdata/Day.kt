package com.example.weatherappassets.model.response.weatherdata

data class Day(
    val dayOfTheWeek: Int,
    val high: Int,
    val hourlyWeather: List<HourlyWeather>,
    val low: Int,
    val weatherType: String
)