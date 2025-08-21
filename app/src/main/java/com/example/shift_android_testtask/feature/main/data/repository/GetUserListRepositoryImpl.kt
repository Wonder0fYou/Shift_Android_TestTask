package com.example.shift_android_testtask.feature.main.data.repository

import com.example.shift_android_testtask.core.local.api.dao.UserInfoDao
import com.example.shift_android_testtask.feature.main.data.api.UserInfoRemoteApi
import com.example.shift_android_testtask.feature.main.data.mapper.UserInfoMapper
import com.example.shift_android_testtask.feature.main.domain.repository.GetUserListRepository
import com.example.shift_android_testtask.shared.entity.UserInfo
import javax.inject.Inject

class GetUserListRepositoryImpl @Inject constructor(
    private val userInfoRemoteApi: UserInfoRemoteApi,
    private val userInfoMapper: UserInfoMapper,
    private val userInfoDao: UserInfoDao,
) : GetUserListRepository {
    override suspend fun getUsers(refresh: Boolean): List<UserInfo> {
        val cachedUsers = userInfoDao.getUsers()
        if (!refresh && cachedUsers.isNotEmpty()) {
            return cachedUsers
        }
        val response = userInfoRemoteApi.getUsers()
        val userInfo = userInfoMapper.map(response.results)
        userInfoDao.clearAndInsert(userInfo)
        return userInfo
    }
}