package com.example.advanceuinavapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = Green,
    background = Black,
    surface = Black,
    onPrimary = Black,
    onBackground = Green,
    onSurface = Green
)

@Composable
fun AdvanceUINavAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        typography = Typography,
        content = content
    )
}
