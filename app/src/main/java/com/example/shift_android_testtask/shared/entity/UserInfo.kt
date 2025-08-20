package com.example.shift_android_testtask.shared.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.shift_android_testtask.core.local.values.Tables

@Entity(tableName = Tables.USERS_INFO)
data class UserInfo(
    val gender: String,
    @Embedded(prefix = "name_")
    val name: NameEntity,
    @Embedded(prefix = "location_")
    val location: LocationEntity,
    @PrimaryKey
    val email: String,
    @Embedded(prefix = "login_")
    val login: LoginEntity,
    @Embedded(prefix = "dob_")
    val dob: DobEntity,
    @Embedded(prefix = "registered_")
    val registered: RegisteredEntity,
    val phone: String,
    val cell: String,
    @Embedded(prefix = "id_")
    val id: IdEntity,
    @Embedded(prefix = "picture_")
    val picture: PictureEntity,
    val nat: String
)
