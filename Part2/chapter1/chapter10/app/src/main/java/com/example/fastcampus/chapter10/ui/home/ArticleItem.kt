package com.example.fastcampus.chapter10.ui.home

data class ArticleItem(
    val articleId: String,
    val description: String,
    val imageUrl: String,
    var isBookMark: Boolean,

)
