package com.example.fastcampus.part3.shop.remote.repository;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.example.fastcampus.part3.shop.model.ListItem;
import com.example.fastcampus.part3.shop.remote.MainPagingSource;
import com.example.fastcampus.part3.shop.remote.MainService;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/fastcampus/part3/shop/remote/repository/MainRepositoryImpl;", "Lcom/example/fastcampus/part3/shop/remote/repository/MainRepository;", "mainService", "Lcom/example/fastcampus/part3/shop/remote/MainService;", "(Lcom/example/fastcampus/part3/shop/remote/MainService;)V", "loadList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/fastcampus/part3/shop/model/ListItem;", "app_debug"})
public final class MainRepositoryImpl implements com.example.fastcampus.part3.shop.remote.repository.MainRepository {
    private final com.example.fastcampus.part3.shop.remote.MainService mainService = null;
    
    @javax.inject.Inject
    public MainRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.shop.remote.MainService mainService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.fastcampus.part3.shop.model.ListItem>> loadList() {
        return null;
    }
}