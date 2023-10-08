package com.example.fastcampus.part3.shop.model

data class Image(
    val imageUrl : String
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.IMAGE
}
