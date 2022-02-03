package com.example.weatherappassets.model.response.citydata

data class CityDataFile(
    val cities: List<City>,
    val startIndex: Int,
    val totalCitiesFound: Int
)