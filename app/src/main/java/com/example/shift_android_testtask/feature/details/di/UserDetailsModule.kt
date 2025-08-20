package com.example.shift_android_testtask.feature.details.di

import com.example.shift_android_testtask.feature.details.data.GetCurrentUserRepositoryImpl
import com.example.shift_android_testtask.feature.details.domain.repository.GetCurrentUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UserDetailsModule {

    @Binds
    abstract fun provideGetCurrentUserRepository(impl: GetCurrentUserRepositoryImpl): GetCurrentUserRepository
}