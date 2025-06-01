package com.abdelrahman.raafat.tomjerry.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium

@Composable
fun TomHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 16.dp, bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(R.drawable.ic_tom_account), contentDescription = null)

        Spacer(Modifier.padding(4.dp))
        Text(
            text = "Tom",
            style = titleMedium
        )
        Text(
            text = "specializes in failure!",
            style = bodyNormal
        )

        Spacer(Modifier.padding(4.dp))

        Button(
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = White.copy(alpha = 0.12f)
            ),
            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
            onClick = {
                //TODO
            }
        ) {
            Text(
                text = "Edit foolishness ",
                style = titleMedium.copy(fontSize = 10.sp)
            )
        }
    }
}