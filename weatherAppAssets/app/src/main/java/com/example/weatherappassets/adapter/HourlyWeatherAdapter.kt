package com.example.weatherappassets.adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherappassets.R
import com.example.weatherappassets.databinding.ItemHourlyWeatherBinding
import com.example.weatherappassets.model.response.weatherdata.Day
import com.example.weatherappassets.model.response.weatherdata.HourlyWeather


class HourlyWeatherAdapter(
    private val hour: List<HourlyWeather>
): RecyclerView.Adapter<HourlyWeatherAdapter.HourlyWeatherViewHolder>() {

    class HourlyWeatherViewHolder(
        private val binding: ItemHourlyWeatherBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun bindDay(item: HourlyWeather){


            binding.tvTime.text=item.hour.toString()
            binding.tvTemperature.text=item.temperature.toString()
            binding.tvRainChance.text=item.rainChance.times(100).toInt().toString()+"%"
            binding.tvWindSpeed.text=item.windSpeed.toString()
            binding.tvHumidity.text=item.humidity.toString()

            if (item.weatherType == "sunny") {
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_sunny_active)
            }else if(item.weatherType=="cloudy"){
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_cloudy_active)
            }else if (item.weatherType=="snowSleet"){
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_snow_sleet_active)
            }else if (item.weatherType=="heavyRain"){
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_heavy_rain_active)
            }else if (item.weatherType=="lightRain"){
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_light_rain_active)
            }else if (item.weatherType=="partlyCloudy"){
                binding.tvWeatherType.setImageResource(R.drawable.ic_icon_weather_active_ic_light_rain_active)
            }
        }
        companion object{
            fun newInstance(parent: ViewGroup)= ItemHourlyWeatherBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            ).let { HourlyWeatherViewHolder(it) }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = HourlyWeatherViewHolder.newInstance(parent)

    override fun onBindViewHolder(holder: HourlyWeatherViewHolder, position: Int) {
        holder.bindDay(hour[position])
    }

    override fun getItemCount() = hour.size

}