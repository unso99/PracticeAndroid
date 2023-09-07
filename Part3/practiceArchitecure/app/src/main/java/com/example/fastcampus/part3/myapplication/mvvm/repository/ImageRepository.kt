package com.example.fastcampus.part3.myapplication.mvvm.repository

import com.example.fastcampus.part3.myapplication.mvvm.model.Image
import io.reactivex.Single

interface ImageRepository {

    fun getRandomImage() : Single<Image>
}