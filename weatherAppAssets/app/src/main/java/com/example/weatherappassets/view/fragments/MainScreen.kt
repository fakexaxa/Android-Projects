package com.example.weatherappassets.view.fragments
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.weatherappassets.modelview.CityViewModel
import com.example.weatherappassets.R
import com.example.weatherappassets.adapter.HourlyWeatherAdapter
import com.example.weatherappassets.adapter.WeatherDataAdapter
import com.example.weatherappassets.databinding.FragmentMainscreenBinding
import com.example.weatherappassets.model.response.weatherdata.HourlyWeather
import com.example.weatherappassets.model.response.weatherdata.WeatherData
import com.example.weatherappassets.util.ViewState


class MainScreen : Fragment(R.layout.fragment_mainscreen) {

    private var _binding: FragmentMainscreenBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<CityViewModel>()
    private val args by navArgs<MainScreenArgs>()

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentMainscreenBinding.inflate(inflater, container, false).also {
        _binding = it

    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initObservers()
        initViews()
    }
    private fun initViews() {
        viewModel.load(args.message)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                val action = MainScreenDirections.actionMainScreenToSearchScreen()
                findNavController().navigate(action)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initObservers() = with(viewModel) {
        viewState.observe(viewLifecycleOwner) { state ->
            binding.loader.isVisible = state is ViewState.loading
            if (state is ViewState.Success) handleSuccess(state.weatherData)
            if (state is ViewState.Error) handleError(state.exception)
        }
    }
    private fun handleError(exception: String) {
        Toast.makeText(context, exception, Toast.LENGTH_SHORT).show()
    }
    private fun handleSuccess(weatherData: WeatherData)= with(binding) {

        val url: String = weatherData.city.imageURLs.androidImageURLs.hdpiImageURL
        val cityAndState: String = weatherData.city.asciiname + ", " + weatherData.city.admin1Code

        tvCityState.text = cityAndState
        tvTemp.text=weatherData.weather.days[0].low.toString()+"°"
        tvDate.text=weatherData.city.modificationDate
        rvCitydata.adapter = WeatherDataAdapter(weatherData.weather.days)

        rvHourlyData(weatherData)
        context?.let {
            Glide.with(it)
                .load(url)
                .into(binding.ivImage)
        }
    }
    private fun adapter(list: List<HourlyWeather>) {
        binding.rvHourWeatherData.adapter = HourlyWeatherAdapter(list)
    }

    private fun rvHourlyData(weatherData: WeatherData) = with(binding) {

        adapter(weatherData.weather.days[0].hourlyWeather)
        includeId.tvMonday.setOnClickListener {
            adapter(weatherData.weather.days[0].hourlyWeather)
        }
        includeId.tvTuesday.setOnClickListener {
            adapter(weatherData.weather.days[1].hourlyWeather)
        }
        includeId.tvWednesday.setOnClickListener {
            adapter(weatherData.weather.days[2].hourlyWeather)
        }
        includeId.tvThursday.setOnClickListener {
            adapter(weatherData.weather.days[3].hourlyWeather)
        }
        includeId.tvFriday.setOnClickListener {
            adapter(weatherData.weather.days[4].hourlyWeather)
        }
        includeId.tvSaturday.setOnClickListener {
            adapter(weatherData.weather.days[5].hourlyWeather)
        }
        includeId.tvSunday.setOnClickListener {
            adapter(weatherData.weather.days[6].hourlyWeather)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}