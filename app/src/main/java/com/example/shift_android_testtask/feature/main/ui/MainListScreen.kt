package com.example.shift_android_testtask.feature.main.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.shift_android_testtask.component.ui.compose.ErrorState
import com.example.shift_android_testtask.component.ui.compose.LoadingState
import com.example.shift_android_testtask.component.ui.compose.UiScaffold
import com.example.shift_android_testtask.feature.main.presentation.MainListState
import com.example.shift_android_testtask.feature.main.presentation.MainListViewModel

@Composable
fun MainListScreen(
    modifier: Modifier = Modifier,
    viewModel: MainListViewModel = hiltViewModel()
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.loadUsers()
    }

    UiScaffold(
        modifier = modifier,
        topBar = {
            ProfileMainScreenTopBar()
        }
    ) { paddingValues ->
        when (val currentState = state) {
            is MainListState.Content -> {
                MainListContent(
                    modifier = Modifier.padding(top = paddingValues.calculateTopPadding()),
                    userList = currentState.list,
                    currentUserClick = { email ->
                        viewModel.openUser(email)
                    }
                )
            }

            is MainListState.Failure -> {
                ErrorState(reason = currentState.message)
            }

            MainListState.Initial, MainListState.Loading -> {
                LoadingState()
            }
        }
    }
}