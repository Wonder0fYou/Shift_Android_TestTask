package com.example.shift_android_testtask.component.ui.compose.topBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import com.example.shift_android_testtask.component.ui.compose.ActionIconItem

@Stable
data class TopBarConfiguration(
    val title: @Composable () -> Unit = {},
    val navigationAction: ActionIconItem? = null,
    val actions: List<ActionIconItem>? = null,
)
