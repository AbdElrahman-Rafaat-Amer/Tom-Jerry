package com.abdelrahman.raafat.tomjerry.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdelrahman.raafat.tomjerry.R

@Composable
fun CheeseRow(
    price: String,
    modifier: Modifier = Modifier,
    oldPrice: String? = null,
) {
    Row(
        modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CheeseCard(
            price = price,
            oldPrice = oldPrice,
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .border(
                    1.dp,
                    color = Color(0xFF03578A),
                    shape = RoundedCornerShape(8.dp)
                )
                .size(30.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_cart),
                contentDescription = null,
            )
        }
    }
}

@Composable
fun CheeseCard(
    price: String,
    oldPrice: String?,
    contentColor: Color = Color(0xFF03578A),
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.height(height = 30.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE9F6FB),
            contentColor = contentColor
        ),
        shape = MaterialTheme.shapes.extraSmall,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(R.drawable.ic_money_bag),
                contentDescription = null, modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            oldPrice?.let {
                Text(
                    text = it.toString(),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF03578A),
                        textDecoration = TextDecoration.LineThrough
                    )
                )
            }
            Text(
                text = " $price cheeses",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF03578A)
                )
            )
        }
    }
}