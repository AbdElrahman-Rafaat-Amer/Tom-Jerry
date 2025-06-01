package com.abdelrahman.raafat.tomjerry.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.abdelrahman.raafat.tomjerry.ui.theme.White
import com.abdelrahman.raafat.tomjerry.ui.theme.titleLarge
import com.abdelrahman.raafat.tomjerry.ui.theme.titleMediumSetting

@Composable
fun SettingsSection(
    sectionTitle: String,
    sectionItems: List<SettingsItem>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        SectionTitle(title = sectionTitle)

        Spacer(Modifier.height(8.dp))
        sectionItems.forEachIndexed { index, item ->
            SettingsRow(icon = item.icon, text = item.text)
            if (index != sectionItems.lastIndex) {
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        style = titleLarge,
    )
}

@Composable
fun SettingsRow(icon: Painter, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = White,
                    shape = RoundedCornerShape(8.dp)
                )
                .size(40.dp)
                .padding(8.dp)

        ) {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }

        Text(text = text, style = titleMediumSetting)
    }
}