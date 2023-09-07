package com.example.fastcampus.part3.myapplication.mvvm.repository

import com.example.fastcampus.part3.myapplication.RetrofitManager
import com.example.fastcampus.part3.myapplication.mvvm.model.Image
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ImageRepositoryImpl : ImageRepository {
    override fun getRandomImage() = RetrofitManager.imageService.getRandomImageRx()
        //어느 쓰레드로 통신할건지 정함
        .subscribeOn(Schedulers.io())
        //서브스크라이브함수가 처리 되는 부분
        .observeOn(AndroidSchedulers.mainThread())
        .flatMap { item ->
            Single.just(Image(item.urls.regular, item.color))
        }
}