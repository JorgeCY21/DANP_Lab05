package com.example.laboratorio_05.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

enum class AppThemeMode {
    BLUE,
    GREEN,
    PURPLE,
    ORANGE
}

@Composable
fun ModularStoreTheme(
    themeMode: AppThemeMode,
    content: @Composable () -> Unit
) {
    val colorScheme = when (themeMode) {
        AppThemeMode.BLUE -> lightColorScheme(
            primary = BluePrimary,
            background = LightBackground,
            surface = LightBackground
        )

        AppThemeMode.GREEN -> lightColorScheme(
            primary = GreenPrimary,
            background = LightBackground,
            surface = LightBackground
        )

        AppThemeMode.PURPLE -> lightColorScheme(
            primary = PurplePrimary,
            background = LightBackground,
            surface = LightBackground
        )

        AppThemeMode.ORANGE -> lightColorScheme(
            primary = OrangePrimary,
            secondary = OrangeSecondary,
            background = OrangeBackground,
            surface = OrangeSurface
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}