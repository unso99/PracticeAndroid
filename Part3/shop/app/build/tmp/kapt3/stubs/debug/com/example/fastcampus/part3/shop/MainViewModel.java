package com.example.fastcampus.part3.shop;

import androidx.lifecycle.ViewModel;
import androidx.paging.PagingData;
import com.example.fastcampus.part3.shop.model.ListItem;
import com.example.fastcampus.part3.shop.remote.repository.MainRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/fastcampus/part3/shop/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/fastcampus/part3/shop/remote/repository/MainRepository;", "(Lcom/example/fastcampus/part3/shop/remote/repository/MainRepository;)V", "_pagingData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/PagingData;", "Lcom/example/fastcampus/part3/shop/model/ListItem;", "get_pagingData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "pagingData", "Lkotlinx/coroutines/flow/StateFlow;", "getPagingData", "()Lkotlinx/coroutines/flow/StateFlow;", "getList", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.fastcampus.part3.shop.remote.repository.MainRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.fastcampus.part3.shop.model.ListItem>> _pagingData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.fastcampus.part3.shop.model.ListItem>> pagingData = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.shop.remote.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.PagingData<com.example.fastcampus.part3.shop.model.ListItem>> get_pagingData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.PagingData<com.example.fastcampus.part3.shop.model.ListItem>> getPagingData() {
        return null;
    }
    
    private final void getList() {
    }
}