package com.example.shift_android_testtask.core.local.di

import android.content.Context
import androidx.room.Room
import com.example.shift_android_testtask.core.local.Database
import com.example.shift_android_testtask.core.local.values.DatabaseValues
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) : Database {
        return Room.databaseBuilder(
            context,
            Database::class.java,
            DatabaseValues.DATABASE_NAME
        )
            .build()
    }

    @Singleton
    @Provides
    fun provideUserInfoDao(database: Database) = database.userInfoDao()
}