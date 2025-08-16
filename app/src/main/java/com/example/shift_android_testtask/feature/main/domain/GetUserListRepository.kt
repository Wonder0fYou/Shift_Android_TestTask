package com.example.shift_android_testtask.feature.main.domain

import com.example.shift_android_testtask.feature.main.domain.entity.UserInfo

interface GetUserListRepository {
    suspend fun getUsers() : UserInfo
}