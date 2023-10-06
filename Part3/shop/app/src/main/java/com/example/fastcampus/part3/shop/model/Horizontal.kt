package com.example.fastcampus.part3.shop.model

data class Horizontal(
    val title : String,
    val items : List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.HORIZONTAL
}
