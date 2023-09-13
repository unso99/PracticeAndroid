package com.example.fastcampus.part3.myapplication

import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImageService {
    @Headers("Authorization: Client-ID AhrX3ZTCa1Rs9BjPsqLTxN8moMLHyK7OzjL74YnlfUI")
    @GET("photos/random")
    fun getRandomImage() : Call<ImageResponse>

    @Headers("Authorization: Client-ID AhrX3ZTCa1Rs9BjPsqLTxN8moMLHyK7OzjL74YnlfUI")
    @GET("photos/random")
    fun getRandomImageRx() : Single<ImageResponse>

    @Headers("Authorization: Client-ID AhrX3ZTCa1Rs9BjPsqLTxN8moMLHyK7OzjL74YnlfUI")
    @GET("photos/random")
    suspend fun getRandomImageSuspend() : ImageResponse
}