package com.example.weatherappassets.util

import com.example.weatherappassets.model.response.citydata.CityDataFile
import com.example.weatherappassets.model.response.weatherdata.HourlyWeather
import com.example.weatherappassets.model.response.weatherdata.WeatherData


sealed class ViewState {
    object loading: ViewState()
    data class Error(val exception: String): ViewState()
    data class Success(val weatherData: WeatherData): ViewState()
    object Empty: ViewState()
}