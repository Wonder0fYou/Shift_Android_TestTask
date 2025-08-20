package com.example.shift_android_testtask.feature.details.data

import com.example.shift_android_testtask.core.local.api.dao.UserInfoDao
import com.example.shift_android_testtask.feature.details.domain.repository.GetCurrentUserRepository
import com.example.shift_android_testtask.shared.entity.UserInfo
import javax.inject.Inject

class GetCurrentUserRepositoryImpl @Inject constructor(
    private val userInfoDao: UserInfoDao
) : GetCurrentUserRepository {
    override suspend fun getUser(userEmail: String): UserInfo {
        val user = userInfoDao.getUserByEmail(userEmail)
        return user
    }
}