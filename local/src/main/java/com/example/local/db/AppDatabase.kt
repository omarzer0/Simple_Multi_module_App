package com.example.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.local.dao.PostDao
import com.example.local.model.DbPost

@Database(entities = [DbPost::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}