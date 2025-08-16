package com.example.shift_android_testtask.app.navigation

import com.example.shift_android_testtask.app.presentation.MainRouter
import com.example.shift_android_testtask.core.navigation.GlobalRouter
import com.example.shift_android_testtask.feature.main.MainListRoute
import javax.inject.Inject

class MainRouterImpl @Inject constructor(
    private val globalRouter: GlobalRouter
) : MainRouter {
    override fun openListUsers() {
        globalRouter.open(MainListRoute)
    }
}