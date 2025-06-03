package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import com.abdelrahman.raafat.tomjerry.ui.theme.Delta
import com.abdelrahman.raafat.tomjerry.ui.theme.Tuatara
import com.abdelrahman.raafat.tomjerry.ui.theme.VeniceBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium10sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium14sp

@Composable
fun JerryTopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_jerry),
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(Modifier.width(8.dp))
        Column {
            Text(
                stringResource(R.string.hi_jerry),
                style = titleMedium14sp.copy(color = Tuatara)
            )
            Text(
                stringResource(R.string.which_tom_do_you_want_to_buy),
                style = bodyNormal.copy(color = Delta)
            )
        }

        Spacer(Modifier.weight(1f))

        Box(
            contentAlignment = Alignment.TopEnd,
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .border(1.dp, color = Color(0x261F1F1E), shape = RoundedCornerShape(12.dp))
                    .size(40.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_notification),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .offset(x = 5.dp, y = (-2).dp)
                    .size(14.dp)
                    .background(VeniceBlue, CircleShape)

            ) {
                Text(
                    text = "3",
                    style = bodyMedium10sp
                )
            }
        }
    }
}