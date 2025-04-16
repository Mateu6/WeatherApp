package com.matapp.weatherapp.feature.weather.presentation

import com.matapp.weatherapp.feature.weather.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
