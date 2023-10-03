package com.example.fastcampus.part3.shop.model

import java.io.Serializable


interface ListItem : Serializable {
    //객체를 파일로 저장하거나 네트워크로전송할때 유용
    val viewType: ViewType

    fun getKey() = hashCode()
}

enum class ViewType {
    VIEW_PAGER,
    HORIZONTAL,
    FULL_AD,

    SELL_ITEM,
    IMAGE,
    SALE,
    COUPON,

    EMPTY
}