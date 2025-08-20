package com.example.shift_android_testtask.core.navigation

import androidx.navigation.NavController
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GlobalRouterImpl @Inject constructor() : GlobalRouter, NavControllerHolder {

    private var navController: NavController? = null

    override fun open(route: Any) {
        navController?.navigate(route)
    }

    override fun pop() {
        navController?.popBackStack()
    }

    override fun setNavController(navController: NavController) {
        this.navController = navController
    }

    override fun clearNavController() {
        navController = null
    }
}