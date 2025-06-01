package com.abdelrahman.raafat.tomjerry.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(

    )

)

val titleLarge = TextStyle(
    fontSize = 20.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Bold,
    color = Black,
    letterSpacing = 0.sp
)

val titleMedium = TextStyle(
    fontSize = 18.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Medium,
    color = White,
    letterSpacing = 0.sp
)

val titleMediumSetting = titleMedium.copy(
    fontSize = 16.sp,
    color = Black
)

val bodyNormal = TextStyle(
    fontSize = 12.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Normal,
    color = White.copy(alpha = 0.8f),
    letterSpacing = 0.sp
)

val bodySemiBold = TextStyle(
    fontSize = 16.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.SemiBold,
    color = CodGray,
    letterSpacing = 0.5.sp
)