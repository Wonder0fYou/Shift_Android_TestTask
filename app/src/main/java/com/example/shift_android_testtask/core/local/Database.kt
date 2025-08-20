package com.example.shift_android_testtask.core.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shift_android_testtask.core.local.api.dao.UserInfoDao
import com.example.shift_android_testtask.core.local.values.DatabaseValues
import com.example.shift_android_testtask.shared.entity.UserInfo
import javax.inject.Singleton

@Singleton
@Database(
    entities = [
        UserInfo::class
    ],
    version = DatabaseValues.DATABASE_VERSION,
    exportSchema = false,
)
abstract class Database : RoomDatabase() {
    abstract fun userInfoDao(): UserInfoDao
}