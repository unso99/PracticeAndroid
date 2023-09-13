package com.example.fastcampus.part3.myapplication.mvi

import com.example.fastcampus.part3.myapplication.mvi.model.Image

sealed class MviState {
    //초기상태
    object Idle : MviState()

    //로딩바 호출
    object Loading : MviState()
    data class LoadedImage(
        val image: Image,
        val count: Int,
    ) : MviState()


}
