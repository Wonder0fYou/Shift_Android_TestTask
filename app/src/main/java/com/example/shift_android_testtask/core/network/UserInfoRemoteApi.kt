package com.example.shift_android_testtask.core.network

import com.example.shift_android_testtask.core.network.model.UserResponse
import retrofit2.http.GET

interface UserInfoRemoteApi {
    @GET
    suspend fun getUsers() : UserResponse
}