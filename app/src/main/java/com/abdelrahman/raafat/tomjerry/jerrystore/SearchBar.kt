package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.ui.theme.LightDelta
import com.abdelrahman.raafat.tomjerry.ui.theme.VeniceBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.White

@Composable
fun SearchBar() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(minHeight = 48.dp)
                .background(White, RoundedCornerShape(12.dp))
                .border(width = 1.dp, color = LightDelta)
                .padding(12.dp)
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                stringResource(R.string.search_about_tom),
                color = Color.Gray,
            )
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(VeniceBlue)
                .clickable {
                    //TODO
                }
        ) {
            Image(
                painter = painterResource(R.drawable.ic_filter),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}