package com.example.shift_android_testtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.example.shift_android_testtask.component.ui.compose.UiScaffold
import com.example.shift_android_testtask.component.ui.theme.Shift_Android_TestTaskTheme
import com.example.shift_android_testtask.core.navigation.GlobalRouter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var globalRouter: GlobalRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Shift_Android_TestTaskTheme {
                UiScaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    MainScreen(
                        globalRouter = globalRouter,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                bottom = innerPadding.calculateBottomPadding()
                            )
                            .imePadding()
                    )
                }
            }
        }
    }
}