package com.example.weatherappassets.adapter
import android.graphics.drawable.Icon
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherappassets.R
import com.example.weatherappassets.databinding.ItemCitydataBinding
import com.example.weatherappassets.model.response.weatherdata.Day


class WeatherDataAdapter(
    private val day: List<Day>
): RecyclerView.Adapter<WeatherDataAdapter.CityDataViewHolder>() {

    class CityDataViewHolder(
        private val binding: ItemCitydataBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun bindDay(day: Day){

          //  binding.tvListWeathertype.text= day.weatherType
            binding.tvListTemperature.text= day.hourlyWeather[0].temperature.toString()


                if (day.weatherType == "sunny") {
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_sunny_active)
                }else if(day.weatherType=="cloudy"){
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_cloudy_active)
                }else if (day.weatherType=="snowSleet"){
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_snow_sleet_active)
                }else if (day.weatherType=="heavyRain"){
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_heavy_rain_active)
                }else if (day.weatherType=="lightRain"){
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_light_rain_active)
                }else if (day.weatherType=="partlyCloudy"){
                    binding.tvListWeathertype.setImageResource(R.drawable.ic_icon_weather_active_ic_light_rain_active)
                }
        }
        companion object{
            fun newInstance(parent: ViewGroup)= ItemCitydataBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            ).let { CityDataViewHolder(it) }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = CityDataViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: CityDataViewHolder, position: Int) {
        holder.bindDay(day[position])
    }


    override fun getItemCount() = day.size



}