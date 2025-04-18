package com.matapp.weatherapp.di

import com.matapp.weatherapp.feature.weather.data.location.DefaultLocationTracker
import com.matapp.weatherapp.feature.weather.data.repository.WeatherRepositoryImpl
import com.matapp.weatherapp.feature.weather.domain.location.LocationTracker
import com.matapp.weatherapp.feature.weather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}