package com.example.shift_android_testtask.feature.details.presentation

import androidx.lifecycle.viewModelScope
import com.example.shift_android_testtask.component.presentation.BaseViewModel
import com.example.shift_android_testtask.feature.details.domain.usecase.GetCurrentUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserDetailsViewModel @Inject constructor(
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val userDetailsRouter: UserDetailsRouter
) : BaseViewModel<UserDetailsState>() {

    override fun initState(): UserDetailsState = UserDetailsState.Initial

    fun loadUser(email: String) {
        viewModelScope.launch {
            setState(UserDetailsState.Loading)
            try {
                val user = getCurrentUserUseCase(email)
                setState(UserDetailsState.Content(user))
            } catch (e: Exception) {
                setState(UserDetailsState.Failure(e.message ?: "Unknown"))
            }
        }
    }

    fun back() {
        userDetailsRouter.back()
    }
}