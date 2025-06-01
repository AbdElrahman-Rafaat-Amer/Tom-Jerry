package com.abdelrahman.raafat.tomjerry.tomaccount

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class StatData(
    val title: String,
    val subtitle: String,
    @DrawableRes val iconRes: Int,
    val backgroundColor: Color
)