package com.example.advanceuinavapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.advanceuinavapp.ui.navigation.AppNavigation
import com.example.advanceuinavapp.ui.theme.AdvanceUINavAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Set the app theme and call the main navigation composable
            AdvanceUINavAppTheme {
                AppNavigation()
            }
        }
    }
}




