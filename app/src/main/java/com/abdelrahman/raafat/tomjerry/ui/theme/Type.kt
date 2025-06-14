package com.abdelrahman.raafat.tomjerry.ui.theme

import androidx.compose.material3.Typography
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

val titleMedium16sp = TextStyle(
    fontSize = 16.sp,
    lineHeight = 16.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Medium,
    color = White.copy(alpha = 0.87f),
    letterSpacing = 0.5.sp
)

val titleMedium14sp = TextStyle(
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Medium,
    color = CodGray,
    letterSpacing = 0.5.sp
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
)

val bodyNormal14sp = TextStyle(
    fontSize = 14.sp,
    lineHeight = 16.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Normal,
    color = CodGray,
    letterSpacing = 0.5.sp
)

val bodyMedium12sp = TextStyle(
    fontSize = 12.sp,
    lineHeight = 16.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Medium,
    color = TranslucentCharcoal,
    letterSpacing = 0.5.sp
)

val bodyMedium10sp = TextStyle(
    fontSize = 10.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.Medium,
    color = White,
    letterSpacing = 0.5.sp
)

val bodySemiBold = TextStyle(
    fontSize = 16.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.SemiBold,
    color = CodGray,
    letterSpacing = 0.5.sp
)

val bodySemiBold20sp = TextStyle(
    fontSize = 20.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.SemiBold,
    color = Black.copy(alpha = 1f),
    letterSpacing = 0.5.sp
)

val bodySemiBold18sp = TextStyle(
    fontSize = 18.sp,
    fontFamily = ibm_plex_sans_arabic,
    fontWeight = FontWeight.SemiBold,
    color = Tuatara,
)