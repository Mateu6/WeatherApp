package com.matapp.weatherapp.feature.weather.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun WeatherAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}