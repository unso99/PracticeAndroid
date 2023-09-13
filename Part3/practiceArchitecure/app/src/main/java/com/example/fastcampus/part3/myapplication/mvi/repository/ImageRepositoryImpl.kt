package com.example.fastcampus.part3.myapplication.mvi.repository

import com.example.fastcampus.part3.myapplication.RetrofitManager
import com.example.fastcampus.part3.myapplication.mvi.model.Image
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ImageRepositoryImpl(private val dispatcher: CoroutineDispatcher = Dispatchers.IO):ImageRepository {
    override suspend fun getRandomImage() = RetrofitManager.imageService.getRandomImageSuspend().let {
        withContext(dispatcher){
            Image(it.urls.regular,it.color)
        }
    }
}