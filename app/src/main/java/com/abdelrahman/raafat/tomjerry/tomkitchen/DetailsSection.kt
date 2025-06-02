package com.abdelrahman.raafat.tomjerry.tomkitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.tomaccount.StatData
import com.abdelrahman.raafat.tomjerry.ui.theme.Black
import com.abdelrahman.raafat.tomjerry.ui.theme.LinkWater
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium12sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium

@Composable
fun DetailsSection() {
    val details = listOf(
        StatData(
            title = "1000 V",
            subtitle = "Temperature ",
            iconRes = R.drawable.ic_heat_temp,
            backgroundColor = LinkWater
        ),
        StatData(
            title = "3 sparks",
            subtitle = "Time ",
            iconRes = R.drawable.ic_clock,
            backgroundColor = LinkWater
        ),
        StatData(
            title = "1M 12K",
            subtitle = "No. of deaths ",
            iconRes = R.drawable.ic_devil,
            backgroundColor = LinkWater
        )
        )

    Column {
        Text(
            text = stringResource(R.string.details),
            style = titleMedium.copy(
                color = Black
            )
        )

        Spacer(Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            details.forEach {
                DetailsCard(it, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Composable
fun DetailsCard(data: StatData, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = data.backgroundColor),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 12.dp, horizontal = 13.5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(data.iconRes),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = data.title,
                style = bodySemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = data.subtitle,
                style = bodyMedium12sp
            )
        }
    }
}