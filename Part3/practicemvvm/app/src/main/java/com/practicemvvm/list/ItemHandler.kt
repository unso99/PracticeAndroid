package com.practicemvvm.list

import com.practicemvvm.model.ListItem

interface ItemHandler {

    fun onClickFavorite(item:ListItem)
}