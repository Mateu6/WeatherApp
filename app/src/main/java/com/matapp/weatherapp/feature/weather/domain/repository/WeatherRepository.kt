package com.matapp.weatherapp.feature.weather.domain.repository

import com.matapp.weatherapp.feature.weather.domain.util.Resource
import com.matapp.weatherapp.feature.weather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}