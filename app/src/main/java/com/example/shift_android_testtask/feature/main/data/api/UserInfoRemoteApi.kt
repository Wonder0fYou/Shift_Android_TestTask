package com.example.shift_android_testtask.feature.main.data.api

import com.example.shift_android_testtask.core.network.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface UserInfoRemoteApi {
    @GET(".")
    suspend fun getUsers(
        @Query("results") results: Int = 20
    ) : UserResponse
}