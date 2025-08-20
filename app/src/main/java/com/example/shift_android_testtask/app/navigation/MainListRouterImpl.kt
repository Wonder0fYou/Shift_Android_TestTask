package com.example.shift_android_testtask.app.navigation

import com.example.shift_android_testtask.core.navigation.GlobalRouter
import com.example.shift_android_testtask.feature.details.UserDetailsRoute
import com.example.shift_android_testtask.feature.main.presentation.MainListRouter
import javax.inject.Inject

class MainListRouterImpl @Inject constructor(
    private val globalRouter: GlobalRouter
) : MainListRouter {
    override fun openUserDetails(userEmail: String) {
        globalRouter.open(UserDetailsRoute(userEmail))
    }
}