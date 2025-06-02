package com.abdelrahman.raafat.tomjerry.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.ui.theme.CodGray2
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold

@Composable
fun StatsSection(stats: List<StatData>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        stats.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                rowItems.forEach { stat ->
                    Box(
                        modifier = Modifier.weight(1f).aspectRatio(2f)
                    ) {
                        StatCard(stat)
                    }
                }

                if (rowItems.size == 1) {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }

}


@Composable
fun StatCard(data: StatData, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = modifier.fillMaxSize(), // Ensures it fills the Box
        colors = CardDefaults.cardColors(containerColor = data.backgroundColor),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(data.iconRes),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .background(White, CircleShape),
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = data.title,
                    style = bodySemiBold
                )
                Text(
                    text = data.subtitle,
                    style = bodySemiBold.copy(color = CodGray2)
                )
            }
        }
    }
}