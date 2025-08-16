package com.example.shift_android_testtask.app.navigation.di

import com.example.shift_android_testtask.app.navigation.MainRouterImpl
import com.example.shift_android_testtask.app.presentation.MainRouter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RouteModule {
    @Binds
    abstract fun bindMainRoute(impl: MainRouterImpl) : MainRouter
}