package com.example.shift_android_testtask.component.ui.compose.topBar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.shift_android_testtask.component.ui.compose.UiText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UiCenterAlignedTopBar(
    modifier: Modifier = Modifier,
    topBarConfiguration: TopBarConfiguration
) {
    CenterAlignedTopAppBar(
        modifier = modifier.fillMaxWidth(),
        title = topBarConfiguration.title,
        navigationIcon = {
            topBarConfiguration.navigationAction?.let { navigation ->
                TopBarIcon(
                    iconRes = navigation.iconRes,
                    contentDescription = navigation.contentDescription,
                    onClick = navigation.onClick,
                )
            }
        },
        actions = {
            topBarConfiguration.actions?.forEach { action ->
                TopBarIcon(
                    iconRes = action.iconRes,
                    contentDescription = action.contentDescription,
                    onClick = action.onClick
                )
            }
        },
    )
}

@Composable
fun TopBarIcon(
    modifier: Modifier = Modifier,
    iconRes: Int,
    contentDescription: String?,
    onClick: () -> Unit,
) {
    IconButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = iconRes),
            contentDescription = contentDescription
        )
    }
}

@Composable
fun TopBarTitleWithText(
    modifier: Modifier = Modifier,
    text: String
) {
    UiText(
        modifier = modifier,
        text = text,
    )
}