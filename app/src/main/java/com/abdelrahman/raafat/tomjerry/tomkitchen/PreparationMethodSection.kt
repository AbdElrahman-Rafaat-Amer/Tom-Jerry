package com.abdelrahman.raafat.tomjerry.tomkitchen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.abdelrahman.raafat.tomjerry.R
import com.abdelrahman.raafat.tomjerry.tomaccount.SectionTitle
import com.abdelrahman.raafat.tomjerry.ui.theme.Black
import com.abdelrahman.raafat.tomjerry.ui.theme.DarkBlue
import com.abdelrahman.raafat.tomjerry.ui.theme.LinkWater
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyMedium12sp
import com.abdelrahman.raafat.tomjerry.ui.theme.bodyNormal14sp
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMedium

@Composable
fun PreparationMethodSection() {
    SectionTitle(
        title = stringResource(R.string.preparation_method),
        textStyle = titleMedium.copy(
            color = Black,
            lineHeight = 32.sp,
            letterSpacing = 0.5.sp
        )
    )

    Spacer(Modifier.height(8.dp))

    val preparationMethods = listOf(
        PreparationMethod(
            title = stringResource(R.string.put_the_pasta_in_a_toaster),
            backgroundColor = White
        ),
        PreparationMethod(
            title = stringResource(R.string.pour_battery_juice_over_it),
            backgroundColor = White
        ),
        PreparationMethod(
            title = stringResource(R.string.wait_for_the_spark_to_ignite),
            backgroundColor = White
        ),
        PreparationMethod(
            title = stringResource(R.string.serve_with_an_insulating_glove),
            backgroundColor = White
        )
    )

    LazyColumn {
        itemsIndexed(preparationMethods) { index, item ->
            PreparationMethodCard(
                item = item,
                number = index + 1
            )
            Spacer(Modifier.height(8.dp))
        }
    }

}

@Composable
fun PreparationMethodCard(item: PreparationMethod, number: Int) {
    Box(
        contentAlignment = Alignment.CenterStart,
    ) {
        Card(
            colors = CardDefaults.cardColors().copy(contentColor = White, containerColor = White),
            shape = CircleShape,
            border = BorderStroke(width = 1.dp, color = LinkWater),
            modifier = Modifier
                .size(36.dp)
                .zIndex(100f)
        ) {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                Text(
                    text = number.toString(),
                    style = bodyMedium12sp.copy(color = DarkBlue),
                    modifier = Modifier.padding(10.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .padding(start = 16.dp)
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .background(item.backgroundColor)
                .fillMaxWidth()
                .padding(top = 6.dp, bottom = 6.dp, end = 8.dp, start = 24.dp)

        ) {
            Text(text = item.title, style = bodyNormal14sp)
        }
    }
}