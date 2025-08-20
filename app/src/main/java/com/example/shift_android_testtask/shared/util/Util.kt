package com.example.shift_android_testtask.shared.util

import android.content.Context
import android.content.Intent
import android.widget.Toast

fun startActivity(context: Context, intent: Intent, message: String) {
    try {
        context.startActivity(intent)
    } catch (e: Exception) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}