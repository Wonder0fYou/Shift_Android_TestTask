package com.example.shift_android_testtask.feature.details.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.shift_android_testtask.component.ui.compose.closeButtonActionItem
import com.example.shift_android_testtask.component.ui.compose.topBar.TopBarConfiguration
import com.example.shift_android_testtask.component.ui.compose.topBar.TopBarTitleWithText
import com.example.shift_android_testtask.component.ui.compose.topBar.UiCenterAlignedTopBar

@Composable
fun UserDetailsScreenTopBar(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
) {
    val topBarConfiguration = TopBarConfiguration(
        title = {
            TopBarTitleWithText(text = "Информация пользователя")
        },
        navigationAction = closeButtonActionItem(onClick = onBackClick)
    )
    UiCenterAlignedTopBar(
        modifier = modifier,
        topBarConfiguration = topBarConfiguration
    )
}