package com.example.shift_android_testtask.feature.main.presentation

import com.example.shift_android_testtask.feature.main.domain.entity.UserInfo

sealed interface MainListState {
    data object Initial : MainListState
    data object Loading : MainListState
    data class Failure(val message: String) : MainListState
    data class Content(val list: List<UserInfo>) : MainListState
}