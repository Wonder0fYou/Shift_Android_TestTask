package com.example.shift_android_testtask.feature.main.presentation

import androidx.lifecycle.viewModelScope
import com.example.shift_android_testtask.component.presentation.BaseViewModel
import com.example.shift_android_testtask.feature.main.domain.usecase.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainListViewModel @Inject constructor(
    private val getUserListUseCase: GetUserListUseCase,
    private val mainListRouter: MainListRouter
) : BaseViewModel<MainListState>() {

    override fun initState(): MainListState = MainListState.Initial

    fun loadUsers() {
        viewModelScope.launch {
            setState(MainListState.Loading)
            try {
                val users = getUserListUseCase()
                setState(MainListState.Content(users))
            } catch (e: Exception) {
                setState(MainListState.Failure(e.message ?: "Unknown"))
            }
        }
    }

    fun openUser(userEmail: String) {
        mainListRouter.openUserDetails(userEmail)
    }
}