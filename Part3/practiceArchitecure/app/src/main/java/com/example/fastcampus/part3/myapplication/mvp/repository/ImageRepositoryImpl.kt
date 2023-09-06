package com.example.fastcampus.part3.myapplication.mvp.repository

import com.example.fastcampus.part3.myapplication.ImageResponse
import com.example.fastcampus.part3.myapplication.RetrofitManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ImageRepositoryImpl : ImageRepository {
    override fun getRandomImage(callback: ImageRepository.Callback) {
        RetrofitManager.imageService.getRandomImage()
            .enqueue(object : Callback<ImageResponse>{
                override fun onResponse(
                    call: Call<ImageResponse>,
                    response: Response<ImageResponse>
                ) {
                    if(response.isSuccessful){
                        response.body()?.let {
                            callback.loadImage(it.urls.regular,it.color)
                        }
                    }
                }

                override fun onFailure(call: Call<ImageResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }
}