package com.example.fastcampus.part3.myapplication.mvp.repository

interface ImageRepository {

    fun getRandomImage(callback: Callback)

    interface Callback{
        fun loadImage(url:String, color:String)
    }
}