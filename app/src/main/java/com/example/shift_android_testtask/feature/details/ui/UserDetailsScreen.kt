package com.example.shift_android_testtask.feature.details.ui

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
import com.example.shift_android_testtask.feature.details.presentation.UserDetailsState
import com.example.shift_android_testtask.feature.details.presentation.UserDetailsViewModel

@Composable
fun UserDetailsScreen(
    modifier: Modifier = Modifier,
    viewModel: UserDetailsViewModel = hiltViewModel(),
    email: String,
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(email) {
        viewModel.loadUser(email)
    }

    UiScaffold(
        modifier = modifier,
        topBar = {
            UserDetailsScreenTopBar(onBackClick = viewModel::back)
        }
    ) { paddingValues ->
        when (val currentState = state) {
            is UserDetailsState.Content -> {
                UserDetailsContent(
                    modifier = Modifier.padding(top = paddingValues.calculateTopPadding()),
                    user = currentState.currentUser
                )
            }

            is UserDetailsState.Failure -> {
                ErrorState(reason = currentState.message)
            }

            UserDetailsState.Initial, UserDetailsState.Loading -> {
                LoadingState()
            }
        }
    }
}