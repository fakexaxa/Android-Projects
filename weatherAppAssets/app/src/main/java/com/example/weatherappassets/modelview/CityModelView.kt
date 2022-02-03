package com.example.weatherappassets.modelview

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherappassets.model.CityRepo
import com.example.weatherappassets.model.response.citydata.CityDataFile
import com.example.weatherappassets.model.response.weatherdata.HourlyWeather
import com.example.weatherappassets.model.response.weatherdata.WeatherData
import com.example.weatherappassets.util.ViewState
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.lang.Exception

class CityViewModel : ViewModel() {

    private val _viewState = MutableLiveData<ViewState>(ViewState.loading)
    val viewState: LiveData<ViewState> get() = _viewState

    fun load(name: String ="Chickasaw"){
        viewModelScope.launch {
            val state=try {
                val city = CityRepo.getCityData(name)
                val weather = CityRepo.getWeatherData(city.cities[0].geonameid)
                ViewState.Success(weather)
            }catch (ex: Exception){
                ViewState.Error(ex.message ?: "Something went wrong")
            }
            _viewState.value = state
        }
    }
}

