package com.example.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts_table")
data class DbPost(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val body: String,
    val name: String
)