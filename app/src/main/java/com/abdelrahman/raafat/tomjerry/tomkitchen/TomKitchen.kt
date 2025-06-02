package com.abdelrahman.raafat.tomjerry.tomkitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.tomaccount.SectionTitle
import com.abdelrahman.raafat.tomjerry.ui.theme.AquaHaze
import com.abdelrahman.raafat.tomjerry.ui.theme.JellyBean
import com.abdelrahman.raafat.tomjerry.ui.theme.LightWhite
import com.abdelrahman.raafat.tomjerry.ui.theme.LinkWater
import com.abdelrahman.raafat.tomjerry.ui.theme.MutedTealBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.VeniceBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium14sp
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium16sp

@Composable
fun TomKitchen() {
    Box {
        Image(
            painter = painterResource(R.drawable.ic_food),
            contentDescription = null,
            modifier = Modifier
                .width(188.dp)
                .height(168.dp)
                .offset(y = 58.dp)
                .padding(end = 24.dp)
                .align(Alignment.TopEnd)
                .zIndex(100f)
        )

        Image(
            painter = painterResource(R.drawable.ic_ellipse),
            contentDescription = null,
            modifier = Modifier
                .width(384.dp)
                .height(414.2118.dp)
                .offset(x = (-90).dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MutedTealBlue)
                .zIndex(2f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.24f)
                    .padding(start = 16.dp, top = 40.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {

                IconTextRow(
                    painter = painterResource(R.drawable.ic_high_tension),
                    text = stringResource(R.string.high_tension),
                )
                IconTextRow(
                    painter = painterResource(R.drawable.ic_shocking_foods),
                    text = stringResource(R.string.shocking_foods),
                )
            }

            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .weight(0.76f)
                    .background(AquaHaze)
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column {
                        SectionTitle(title = stringResource(R.string.electric_tom_pasta))

                        Spacer(Modifier.height(12.dp))

                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(LinkWater)
                                .padding(horizontal = 8.dp, vertical = 7.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_money_bag),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = stringResource(R.string._5_cheeses),
                                style = titleMedium.copy(color = VeniceBlue, fontSize = 12.sp)
                            )
                        }
                    }

                    Image(
                        painter = painterResource(R.drawable.ic_heart),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(Modifier.height(8.dp))

                Text(
                    text = stringResource(R.string.pasta_cooked),
                    style = titleMedium14sp
                )

                Spacer(Modifier.height(24.dp))

                DetailsSection()

                Spacer(Modifier.height(24.dp))

                PreparationMethodSection()
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(White),
                contentAlignment = Alignment.Center
            ) {

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 15.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = JellyBean
                    ),
                    onClick = {
                        //TODO
                    }
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = stringResource(R.string.add_to_cart),
                            style = titleMedium16sp.copy(color = LightWhite)
                        )

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(5.dp)
                                .background(
                                    color = White.copy(alpha = 0.38f),
                                    shape = CircleShape
                                )
                        ) {
                        }

                        Column {
                            Text(
                                text = stringResource(R.string._3_cheeses),
                                style = titleMedium16sp.copy(color = White, fontSize = 14.sp)
                            )
                            Text(
                                text = stringResource(R.string._5_cheeses),
                                style = titleMedium16sp.copy(
                                    color = White,
                                    fontSize = 12.sp,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun IconTextRow(
    painter: Painter,
    text: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painter,
            contentDescription = text,
            modifier = Modifier.size(24.dp)
        )
        Text(text = text, style = titleMedium16sp)
    }
}

@Preview(showBackground = true)
@Composable
private fun TomKitchenPreview() {
    TomKitchen()
}