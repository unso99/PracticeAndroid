package com.practicemvvm.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/practicemvvm/repository/SearchRepositoryImpl;", "Lcom/practicemvvm/repository/SearchRepository;", "searchService", "Lcom/practicemvvm/SearchService;", "(Lcom/practicemvvm/SearchService;)V", "search", "Lio/reactivex/rxjava3/core/Observable;", "", "Lcom/practicemvvm/model/ListItem;", "query", "", "app_debug"})
public final class SearchRepositoryImpl implements com.practicemvvm.repository.SearchRepository {
    private final com.practicemvvm.SearchService searchService = null;
    
    public SearchRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.practicemvvm.SearchService searchService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.rxjava3.core.Observable<java.util.List<com.practicemvvm.model.ListItem>> search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
}