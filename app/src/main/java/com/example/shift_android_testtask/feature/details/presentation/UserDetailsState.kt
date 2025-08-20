package com.example.shift_android_testtask.feature.details.presentation

import com.example.shift_android_testtask.shared.entity.UserInfo

interface UserDetailsState {
    data object Initial : UserDetailsState
    data object Loading : UserDetailsState
    data class Failure(val message: String) : UserDetailsState
    data class Content(val currentUser: UserInfo) : UserDetailsState
}