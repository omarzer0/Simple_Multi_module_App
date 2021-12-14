package com.example.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.local.model.DbPost

@Dao
interface PostDao {

    @Query("SELECT * FROM posts_table")
    fun getAllFavouritePosts(): LiveData<List<DbPost>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPostToFavourites(dbPost: DbPost)
}