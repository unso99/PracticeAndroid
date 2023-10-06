package com.example.fastcampus.part3.shop.model

data class ViewPager(
    val items : List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.VIEW_PAGER

}
