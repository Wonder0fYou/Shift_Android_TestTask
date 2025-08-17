package com.example.shift_android_testtask.feature.main.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.shift_android_testtask.component.ui.compose.topBar.TopBarConfiguration
import com.example.shift_android_testtask.component.ui.compose.topBar.TopBarTitleWithText
import com.example.shift_android_testtask.component.ui.compose.topBar.UiCenterAlignedTopBar

@Composable
fun ProfileMainScreenTopBar(
    modifier: Modifier = Modifier,
) {
    val topBarConfiguration = TopBarConfiguration(
        title = {
            TopBarTitleWithText(text = "Список пользователей")
        }
    )
    UiCenterAlignedTopBar(
        modifier = modifier,
        topBarConfiguration = topBarConfiguration
    )
}