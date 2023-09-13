package com.example.fastcampus.part3.myapplication.mvi.repository

import com.example.fastcampus.part3.myapplication.mvi.model.Image

interface ImageRepository {
    suspend fun getRandomImage() : Image
}