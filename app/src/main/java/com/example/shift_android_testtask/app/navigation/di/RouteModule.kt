package com.example.shift_android_testtask.app.navigation.di

import com.example.shift_android_testtask.app.navigation.MainListRouterImpl
import com.example.shift_android_testtask.app.navigation.UserDetailsRouterImpl
import com.example.shift_android_testtask.feature.details.presentation.UserDetailsRouter
import com.example.shift_android_testtask.feature.main.presentation.MainListRouter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RouteModule {

    @Binds
    abstract fun bindMainListRoute(impl: MainListRouterImpl): MainListRouter

    @Binds
    abstract fun bindUserDetailsRoute(impl: UserDetailsRouterImpl): UserDetailsRouter
}