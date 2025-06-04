package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.annotation.DrawableRes

data class Tom(
    val title: String,
    val description: String,
    val price: String,
    val oldPrice: String? = null,
    @DrawableRes val imageRes: Int
)