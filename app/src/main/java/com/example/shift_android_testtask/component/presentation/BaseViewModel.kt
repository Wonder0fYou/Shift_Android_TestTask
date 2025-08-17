package com.example.shift_android_testtask.component.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel<STATE> : ViewModel() {

    private val _state by lazy { MutableStateFlow(initState()) }
    val state: StateFlow<STATE> by lazy { _state }

    protected abstract fun initState(): STATE

    protected fun setState(state: STATE) {
        _state.value = state
    }
}