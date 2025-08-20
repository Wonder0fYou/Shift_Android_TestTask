package com.example.shift_android_testtask.app.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.shift_android_testtask.component.ui.compose.UiSurface
import com.example.shift_android_testtask.core.navigation.NavControllerHolder
import com.example.shift_android_testtask.feature.details.UserDetailsRoute
import com.example.shift_android_testtask.feature.details.ui.UserDetailsScreen
import com.example.shift_android_testtask.feature.main.MainListRoute
import com.example.shift_android_testtask.feature.main.ui.MainListScreen

@Composable
fun MainScreen(
    navControllerHolder: NavControllerHolder,
    modifier: Modifier,
) {
    val navController = rememberNavController()

    DisposableEffect(Unit) {
        navControllerHolder.setNavController(navController)
        onDispose {
            navControllerHolder.clearNavController()
        }
    }

    UiSurface {
        NavHost(
            navController = navController,
            startDestination = MainListRoute
        ) {
            composable<MainListRoute> {
                MainListScreen(
                    modifier = modifier
                )
            }
            composable<UserDetailsRoute> {
                val destination = it.toRoute<UserDetailsRoute>()
                val userEmail = destination.userEmail
                UserDetailsScreen(
                    modifier = modifier,
                    email = userEmail
                )
            }
        }
    }
}