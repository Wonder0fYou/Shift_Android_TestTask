package com.example.shift_android_testtask.component.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun UserCard(
    modifier: Modifier = Modifier,
    imageUrl: String,
    fcs: String,
    address: String,
    phone: String,
    onUserClick: () -> Unit,
) {
    Card(
        modifier = modifier
            .clickable { onUserClick() }
    ) {
        Row(
            modifier = Modifier
        ) {
            WrapperImage(
                model = imageUrl,
                contentDescription = "фото юзера",
                modifier = Modifier
                    .size(128.dp)
                    .clip(CircleShape),
            )
            Column {
                UiText(text = address)
                UiText(text = phone)
                UiText(text = fcs)
            }
        }
    }
}