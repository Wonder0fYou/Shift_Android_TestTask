package com.example.shift_android_testtask.component.ui.compose

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable
import com.example.shift_android_testtask.R

@Stable
data class ActionIconItem(
    @DrawableRes
    val iconRes: Int,
    val contentDescription: String? = null,
    val onClick: () -> Unit,
)

fun closeButtonActionItem(onClick: () -> Unit) = ActionIconItem(
    iconRes = R.drawable.ic_close,
    onClick = onClick,
    contentDescription = "Close",
)