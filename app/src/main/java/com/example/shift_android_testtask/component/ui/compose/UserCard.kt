package com.example.shift_android_testtask.component.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
        Column(
            modifier = Modifier
        ) {
            UiText(text = imageUrl)
            UiText(text = address)
            UiText(text = phone)
            UiText(text = fcs)
        }
    }
}