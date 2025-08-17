package com.example.shift_android_testtask.feature.main.domain.entity

data class UserInfo(
    val gender: String,
    val name: NameEntity,
    val location: LocationEntity,
    val email: String,
    val login: LoginEntity,
    val dob: DobEntity,
    val registered: RegisteredEntity,
    val phone: String,
    val cell: String,
    val id: IdEntity,
    val picture: PictureEntity,
    val nat: String
)
