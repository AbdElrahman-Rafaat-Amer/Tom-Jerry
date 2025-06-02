package com.abdelrahman.raafat.tomjerry.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.ui.theme.AquaHaze
import com.abdelrahman.raafat.tomjerry.ui.theme.Champagne
import com.abdelrahman.raafat.tomjerry.ui.theme.ChromeWhite
import com.abdelrahman.raafat.tomjerry.ui.theme.CodGray
import com.abdelrahman.raafat.tomjerry.ui.theme.HorizontalDividerColor
import com.abdelrahman.raafat.tomjerry.ui.theme.LinkWater
import com.abdelrahman.raafat.tomjerry.ui.theme.VanillaIce
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal

@Composable
fun TomAccount() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.ic_tom_account_bg),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            TomHeader(
                Modifier
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
            )

            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .weight(3f)
                    .background(AquaHaze)
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val stats = listOf(
                    StatData(
                        title = stringResource(R.string._2m_12k),
                        subtitle = stringResource(R.string.no_of_quarrels),
                        iconRes = R.drawable.ic_quarrels,
                        backgroundColor = LinkWater
                    ),
                    StatData(
                        title = stringResource(R.string._500_h),
                        subtitle = stringResource(R.string.chase_time),
                        iconRes = R.drawable.ic_chase_time,
                        backgroundColor = ChromeWhite
                    ),
                    StatData(
                        title = stringResource(R.string._2m_12k),
                        subtitle = stringResource(R.string.hunting_times),
                        iconRes = R.drawable.ic_hunting,
                        backgroundColor = VanillaIce
                    ),
                    StatData(
                        title = stringResource(R.string._3m_7k),
                        subtitle = stringResource(R.string.heartbroken),
                        iconRes = R.drawable.ic_heart_broken,
                        backgroundColor = Champagne
                    )
                )

                StatsSection(
                    stats,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )

                Spacer(Modifier.height(24.dp))

                val tomSettingsItem = listOf(
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_bed),
                        text = stringResource(R.string.change_sleeping_place)
                    ),
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_meow),
                        text = stringResource(R.string.meow_settings)
                    ),
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_password),
                        text = stringResource(R.string.password_to_open_the_fridge)
                    )
                )
                SettingsSection(
                    sectionTitle = stringResource(R.string.tom_settings),
                    sectionItems = tomSettingsItem,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )

                Spacer(Modifier.height(12.dp))
                HorizontalDivider(
                    thickness = 1.dp,
                    color = HorizontalDividerColor
                )
                Spacer(Modifier.height(12.dp))

                val favoriteFoodsSettingsItem = listOf(
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_alert),
                        text = stringResource(R.string.mouses)
                    ),
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_hamburger),
                        text = stringResource(R.string.last_stolen_meal)
                    ),
                    SettingsItem(
                        icon = painterResource(R.drawable.ic_sleeping),
                        text = stringResource(R.string.change_sleep_mood)
                    )
                )
                SettingsSection(
                    sectionTitle = stringResource(R.string.favorite_foods),
                    sectionItems = favoriteFoodsSettingsItem,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )

                Spacer(Modifier.height(24.dp))
                Text(
                    text = stringResource(R.string.v_tombeta),
                    style = bodyNormal.copy(
                        color = CodGray
                    )
                )
            }
        }
    }
}

@Preview
@Composable
private fun TomAccountPreview() {
    TomAccount()
}