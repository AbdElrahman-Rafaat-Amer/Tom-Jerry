package com.abdelrahman.raafat.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abdelrahman.raafat.tomjerry.jerrystore.JerryStore
import com.abdelrahman.raafat.tomjerry.tomkitchen.TomKitchen
import com.abdelrahman.raafat.tomjerry.ui.theme.TomJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TomJerryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    HomeScreen(modifier = Modifier.padding(it))
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
//        JerryStore()
        TomKitchen()
//        TomAccount()
//        SecretEpisodes()
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TomJerryTheme {
        HomeScreen()
    }
}