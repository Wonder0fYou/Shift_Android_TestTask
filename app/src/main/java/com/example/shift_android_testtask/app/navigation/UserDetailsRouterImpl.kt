package com.example.shift_android_testtask.app.navigation

import com.example.shift_android_testtask.core.navigation.GlobalRouter
import com.example.shift_android_testtask.feature.details.presentation.UserDetailsRouter
import javax.inject.Inject

class UserDetailsRouterImpl @Inject constructor(
    private val globalRouter: GlobalRouter
) : UserDetailsRouter{
    override fun back() {
        globalRouter.pop()
    }
}