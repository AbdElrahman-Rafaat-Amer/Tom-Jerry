package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.ui.theme.OsloGray
import com.abdelrahman.raafat.tomjerry.ui.theme.VeniceBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium12sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold18sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodySemiBold20sp

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
            price = "3",
            oldPrice = "5",
            imageRes = R.drawable.ic_sport_tom
        ),
        Tom(
            title = stringResource(R.string.tom_the_lover),
            description = stringResource(R.string.he_loves_one_sidedly),
            price = "5",
            imageRes = R.drawable.ic_tom_the_lover
        ),
        Tom(
            title = stringResource(R.string.tom_the_bomb),
            description = stringResource(R.string.he_blow_shim_self_up),
            price = "10",
            imageRes = R.drawable.ic_tom_the_bomb
        ),
        Tom(
            title = stringResource(R.string.spy_tom),
            description = stringResource(R.string.disguises_as_a_table),
            price = "12",
            imageRes = R.drawable.ic_spy_tom
        ),
        Tom(
            title = stringResource(R.string.frozen_tom),
            description = stringResource(R.string.he_froze_after_the_first_look),
            price = "10",
            imageRes = R.drawable.ic_frozen_tom
        ),
        Tom(
            title = stringResource(R.string.sleeping_tom),
            description = stringResource(R.string.he_just_snores_in_stereo),
            price = "10",
            imageRes = R.drawable.ic_sleeping_tom
        )
    )

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        toms.chunked(2).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                rowItems.forEach { item ->
                    Box(
                        modifier = Modifier
                            .weight(1f),
                    ) {
                        TomCard(item)
                    }
                }
            }
        }
    }
}

@Composable
fun TomCard(tom: Tom) {
    Box(modifier = Modifier.padding(top = 8.dp)) {
        Card(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 16.dp)
                .height(219.dp),
            shape = MaterialTheme.shapes.medium,
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .padding(top = 92.dp),
            ) {
                Text(
                    text = tom.title,
                    style = bodySemiBold18sp.copy(
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = tom.description,
                    style = bodyNormal.copy(
                        color = OsloGray,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(Modifier.weight(1f))
                CheeseRow(
                    price = tom.price,
                    oldPrice = tom.oldPrice,
                    modifier = Modifier.padding(bottom = 18.dp)
                )
            }
        }

        Image(
            painter = painterResource(tom.imageRes),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .sizeIn(maxWidth = 100.dp, maxHeight = 100.dp),
            contentScale = ContentScale.Crop
        )

    }
}

@Preview(showBackground = true)
@Composable
fun CheapTomSectionPreview() {
    CheapTomSection()
}