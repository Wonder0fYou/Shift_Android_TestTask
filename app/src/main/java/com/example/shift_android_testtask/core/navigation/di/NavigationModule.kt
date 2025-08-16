package com.example.shift_android_testtask.core.navigation.di

import com.example.shift_android_testtask.core.navigation.GlobalRouter
import com.example.shift_android_testtask.core.navigation.GlobalRouterImpl
import com.example.shift_android_testtask.core.navigation.NavControllerHolder
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {

    @Binds
    abstract fun bindGlobalRouter(impl: GlobalRouterImpl): GlobalRouter

    @Binds
    abstract fun bindNavControllerHolder(impl: GlobalRouterImpl): NavControllerHolder
}