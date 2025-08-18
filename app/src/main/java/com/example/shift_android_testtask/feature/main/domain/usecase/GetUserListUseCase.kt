package com.example.shift_android_testtask.feature.main.domain.usecase

import com.example.shift_android_testtask.shared.entity.UserInfo
import com.example.shift_android_testtask.feature.main.domain.repository.GetUserListRepository
import javax.inject.Inject

class GetUserListUseCase @Inject constructor(
    private val getUserListRepository: GetUserListRepository
) : suspend () -> List<UserInfo> by getUserListRepository::getUsers