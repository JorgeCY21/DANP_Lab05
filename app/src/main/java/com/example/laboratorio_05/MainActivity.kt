package com.example.laboratorio_05

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.laboratorio_05.navigation.AppNavigation
import com.example.laboratorio_05.ui.theme.AppThemeMode
import com.example.laboratorio_05.ui.theme.ModularStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var currentTheme by remember {
                mutableStateOf(AppThemeMode.BLUE)
            }

            ModularStoreTheme(themeMode = currentTheme) {
                AppNavigation(
                    currentTheme = currentTheme,
                    onThemeChange = { selectedTheme ->
                        currentTheme = selectedTheme
                    }
                )
            }
        }
    }
}