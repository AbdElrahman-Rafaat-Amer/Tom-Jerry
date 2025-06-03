package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.tomaccount.StatCard
import com.abdelrahman.raafat.tomjerry.ui.theme.AquaHaze
import com.abdelrahman.raafat.tomjerry.ui.theme.Black
import com.abdelrahman.raafat.tomjerry.ui.theme.Delta
import com.abdelrahman.raafat.tomjerry.ui.theme.LightDelta
import com.abdelrahman.raafat.tomjerry.ui.theme.OsloGray
import com.abdelrahman.raafat.tomjerry.ui.theme.Tuatara
import com.abdelrahman.raafat.tomjerry.ui.theme.VeniceBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium10sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium12sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal14sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold20sp
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium14sp
import kotlin.collections.chunked
import kotlin.collections.forEach


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
        Spacer(Modifier.height(24.dp))
        PromoBanner()
        Spacer(Modifier.height(24.dp))
        CheapTomSection()
    }
}


@Composable
fun CheapTomSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            stringResource(R.string.cheap_tom_section),
            style = bodySemiBold20sp
        )

        Spacer(Modifier.weight(1f))
        Text(
            stringResource(R.string.view_all),
            style = bodyMedium12sp.copy(color = VeniceBlue)
        )

        Spacer(Modifier.width(5.dp))

        Image(
            painter = painterResource(R.drawable.ic_arrow),
            contentDescription = null,
        )
    }

    Spacer(Modifier.height(8.dp))

    val toms = listOf(
        Tom(
            title = stringResource(R.string.sport_tom),
            description = stringResource(R.string.he_runs_1_meter_trips),
            price = 3,
            imageRes = R.drawable.ic_sport_tom
        ),
        Tom(
            stringResource(R.string.tom_the_lover),
            stringResource(R.string.he_loves_one_sidedly), 5,
            R.drawable.ic_tom_the_lover
        ),
        Tom(
            stringResource(R.string.tom_the_bomb),
            stringResource(R.string.he_blow_shim_self_up), 10,
            R.drawable.ic_tom_the_bomb
        ),
        Tom(
            stringResource(R.string.spy_tom),
            stringResource(R.string.disguises_as_a_table), 12,
            R.drawable.ic_spy_tom
        ),
        Tom(
            stringResource(R.string.frozen_tom),
            stringResource(R.string.he_froze_after_the_first_look), 10,
            R.drawable.ic_frozen_tom
        ),
        Tom(
            stringResource(R.string.sleeping_tom),
            stringResource(R.string.he_just_snores_in_stereo), 10,
            R.drawable.ic_sleeping_tom
        )
    )

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        toms.chunked(2).forEachIndexed { index, rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                rowItems.forEach { item ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
//                            .background(Color.Red)
                    ) {
                        TomCard(item, modifier = Modifier
                            .fillMaxSize()
//                            .background(Color.Yellow)
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun TomCard(tom: Tom, modifier: Modifier = Modifier) {
//    Image(
//        painter = painterResource(id = tom.imageRes),
//        contentDescription = null,
//        modifier = Modifier
//            .height(64.dp)
//            .align(Alignment.CenterHorizontally)
//    )
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors().copy(containerColor = White),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = modifier
//                .defaultMinSize(minHeight = 219.dp)
                .padding(8.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = tom.title,
                style = bodySemiBold20sp.copy(fontSize = 18.sp)
            )
            Spacer(Modifier.height(2.dp))

            Text(
                text = tom.description,
                style = bodyNormal.copy(color = OsloGray),
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.ic_money_bag),
                        contentDescription = null,
                    )
                    Spacer(Modifier.width(4.dp))
                    Text(stringResource(R.string.cheeses, tom.price), fontSize = 12.sp)
                }
                Image(
                    painter = painterResource(R.drawable.ic_cart),
                    contentDescription = null,
                )
            }
        }
    }
}


@Preview
@Composable
private fun JerryStorePreview() {
    JerryStore()
}

