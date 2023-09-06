package com.example.fastcampus.part3.myapplication.mvp

interface MvpContractor {

    interface View {
        fun showImage(url:String,color:String)

        fun showImageCountText(count:Int)
    }

    interface Presenter{
        fun attachView(view:View)

        fun detachView()

        fun loadRandomImage()
    }
}