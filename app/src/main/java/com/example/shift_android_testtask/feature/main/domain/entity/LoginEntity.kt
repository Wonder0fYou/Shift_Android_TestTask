package com.example.shift_android_testtask.feature.main.domain.entity

data class LoginEntity(
    val uuid: String,
    val username: String,
    val password: String,
    val salt: String,
    val md5: String,
    val sha1: String,
    val sha256: String
)
