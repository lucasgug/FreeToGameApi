package com.lucasgugliuzza.freetogameapi.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lucasgugliuzza.freetogameapi.ui.theme.FreeToGameApiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreeToGameApiTheme {

            }
        }
    }
}

