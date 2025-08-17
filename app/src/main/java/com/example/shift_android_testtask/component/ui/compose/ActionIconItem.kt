package com.example.shift_android_testtask.component.ui.compose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable

@Stable
data class ActionIconItem(
    @DrawableRes
    val iconRes : Int,
    val contentDescription: String? = null,
    val onClick: () -> Unit,
)