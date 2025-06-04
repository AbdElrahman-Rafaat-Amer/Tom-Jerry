package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.ui.theme.AquaHaze

@Composable
fun JerryStore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(AquaHaze)
            .padding(
                end = 16.dp,
                start = 16.dp,
                top = 6.dp,
                bottom = 12.dp
            )

    ) {
        JerryTopBar()
        Spacer(Modifier.height(12.dp))
        SearchBar()
        Spacer(Modifier.height(12.dp))
        PromoBanner()
        Spacer(Modifier.height(24.dp))
        CheapTomSection()
    }
}

@Preview
@Composable
private fun JerryStorePreview() {
    JerryStore()
}

