package com.example.shift_android_testtask.feature.main.data.repository

import com.example.shift_android_testtask.feature.main.data.api.UserInfoRemoteApi
import com.example.shift_android_testtask.feature.main.data.mapper.UserInfoMapper
import com.example.shift_android_testtask.feature.main.domain.repository.GetUserListRepository
import com.example.shift_android_testtask.shared.entity.UserInfo
import javax.inject.Inject

class GetUserListRepositoryImpl @Inject constructor(
    private val userInfoRemoteApi: UserInfoRemoteApi,
    private val userInfoMapper: UserInfoMapper,
) : GetUserListRepository {
    override suspend fun getUsers(): List<UserInfo> {
        val response = userInfoRemoteApi.getUsers()
        val userInfo = userInfoMapper.map(response.results)
        return userInfo
    }
}