package com.abdelrahman.raafat.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abdelrahman.raafat.tomjerry.tomaccount.TomAccount
import com.abdelrahman.raafat.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TomJerryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
//    JerryStore()
//    TomKitchen()
    TomAccount()
//    SecretEpisodes()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TomJerryTheme {
        HomeScreen()
    }
}