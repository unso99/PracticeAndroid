package com.example.fastcampus.part3.shop.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.fastcampus.part3.shop.model.ListItem
import com.example.fastcampus.part3.shop.remote.MainPagingSource
import com.example.fastcampus.part3.shop.remote.MainService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService
) : MainRepository {
    override fun loadList(): Flow<PagingData<ListItem>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = true
            ),
            pagingSourceFactory = { MainPagingSource(mainService) }
        ).flow
    }
}