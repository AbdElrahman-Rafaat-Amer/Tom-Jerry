package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold

@Composable
fun PromoBanner() {
    Box(
        contentAlignment = Alignment.BottomEnd
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
        ) {
            Box{
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_promo_back_ground),
                    contentDescription = "Banner Background", modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        stringResource(R.string.buy_1_tom_and_get_2_for_free),
                        style = bodySemiBold.copy(color = White)
                    )
                    Text(
                        stringResource(R.string.adopt_tom_free_fail_free_guarantee),
                        style = bodyNormal
                    )
                }
            }
        }

        Image(
            painter = painterResource(id = R.drawable.ic_tom_money),
            contentDescription = "Tom Money",
            modifier = Modifier.size(height = 108.dp, width = 115.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview
@Composable
fun PromoBannerPreview() {
    PromoBanner()
}