package com.example.fastcampus.chapter4.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val userName: String,


    )
