package com.example.shift_android_testtask.feature.main.domain.repository

import com.example.shift_android_testtask.shared.entity.UserInfo

interface GetUserListRepository {
    suspend fun getUsers() : List<UserInfo>
}