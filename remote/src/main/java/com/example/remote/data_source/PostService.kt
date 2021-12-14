package com.example.remote.data_source

import com.example.remote.dto.DtoPost
import retrofit2.http.GET

interface PostService {

    @GET("comments")
    suspend fun getAllNetworkPosts(): List<DtoPost>

}