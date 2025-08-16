package com.example.shift_android_testtask.core.navigation

import androidx.navigation.NavController

interface NavControllerHolder {
    fun setNavController(navController: NavController)
    fun clearNavController()
}