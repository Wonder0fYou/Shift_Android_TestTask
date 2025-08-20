package com.example.shift_android_testtask.core.local.api.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.shift_android_testtask.core.local.api.BaseDao
import com.example.shift_android_testtask.core.local.values.Tables
import com.example.shift_android_testtask.shared.entity.UserInfo

@Dao
interface UserInfoDao: BaseDao<UserInfo> {

    @Query("SELECT * FROM ${Tables.USERS_INFO}")
    suspend fun getUsers(): List<UserInfo>

    @Query("DELETE FROM ${Tables.USERS_INFO}")
    suspend fun clearUsers()

    @Transaction
    suspend fun clearAndInsert(users: List<UserInfo>) {
        clearUsers()
        insertItems(users)
    }
}