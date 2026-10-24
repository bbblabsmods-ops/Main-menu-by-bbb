package com.questlauncher.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { QuestTheme { LauncherScreen() } }
    }
}

@Composable
fun QuestTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Color(0xFF8AA4FF),
            onPrimary = Color(0xFF0B1030),
            background = Color(0xFF0D0F14),
            surface = Color(0xFF151921),
            surfaceVariant = Color(0xFF1E2430),
            onBackground = Color(0xFFE6E9F2),
            onSurface = Color(0xFFE6E9F2),
            secondaryContainer = Color(0xFF2A3350)
        ),
        content = content
    )
}
