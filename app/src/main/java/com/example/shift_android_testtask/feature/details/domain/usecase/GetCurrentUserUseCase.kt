package com.example.shift_android_testtask.feature.details.domain.usecase

import com.example.shift_android_testtask.feature.details.domain.repository.GetCurrentUserRepository
import com.example.shift_android_testtask.shared.entity.UserInfo
import javax.inject.Inject

class GetCurrentUserUseCase @Inject constructor(
    private val getCurrentUserRepository: GetCurrentUserRepository
) : suspend (String) -> UserInfo by getCurrentUserRepository::getUser