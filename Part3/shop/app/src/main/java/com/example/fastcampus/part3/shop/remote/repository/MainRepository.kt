package com.example.fastcampus.part3.shop.remote.repository

import androidx.paging.PagingData
import com.example.fastcampus.part3.shop.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList() : Flow<PagingData<ListItem>>
}