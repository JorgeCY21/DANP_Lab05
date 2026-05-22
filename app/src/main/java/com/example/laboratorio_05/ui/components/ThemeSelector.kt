package com.example.laboratorio_05.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.laboratorio_05.ui.theme.AppThemeMode

@Composable
fun ThemeSelector(
    currentTheme: AppThemeMode,
    modifier: Modifier = Modifier,
    onThemeSelected: (AppThemeMode) -> Unit
) {
    Column(
        modifier = modifier.padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AppButton(
                text = if (currentTheme == AppThemeMode.BLUE) "Blue ✓" else "Blue",
                modifier = Modifier.weight(1f),
                onClick = {
                    onThemeSelected(AppThemeMode.BLUE)
                }
            )

            AppButton(
                text = if (currentTheme == AppThemeMode.GREEN) "Green ✓" else "Green",
                modifier = Modifier.weight(1f),
                onClick = {
                    onThemeSelected(AppThemeMode.GREEN)
                }
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AppButton(
                text = if (currentTheme == AppThemeMode.PURPLE) "Purple ✓" else "Purple",
                modifier = Modifier.weight(1f),
                onClick = {
                    onThemeSelected(AppThemeMode.PURPLE)
                }
            )

            AppButton(
                text = if (currentTheme == AppThemeMode.ORANGE) "Orange ✓" else "Orange",
                modifier = Modifier.weight(1f),
                onClick = {
                    onThemeSelected(AppThemeMode.ORANGE)
                }
            )
        }
    }
}