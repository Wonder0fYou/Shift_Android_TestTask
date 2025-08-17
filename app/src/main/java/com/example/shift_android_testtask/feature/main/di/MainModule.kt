package com.example.shift_android_testtask.feature.main.di

import com.example.shift_android_testtask.feature.main.data.api.UserInfoRemoteApi
import com.example.shift_android_testtask.feature.main.data.repository.GetUserListRepositoryImpl
import com.example.shift_android_testtask.feature.main.domain.repository.GetUserListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule {
    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): UserInfoRemoteApi {
        return retrofit.create(UserInfoRemoteApi::class.java)
    }

    @Provides
    fun provideGetUserListRepository(impl: GetUserListRepositoryImpl): GetUserListRepository = impl
}