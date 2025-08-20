package com.example.shift_android_testtask.feature.details.domain.repository

import com.example.shift_android_testtask.shared.entity.UserInfo

interface GetCurrentUserRepository {
    suspend fun getUser(userEmail: String): UserInfo
}