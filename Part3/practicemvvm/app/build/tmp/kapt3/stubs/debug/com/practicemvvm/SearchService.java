package com.practicemvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/practicemvvm/SearchService;", "", "searchImage", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/practicemvvm/model/ImageListResponse;", "query", "", "searchVideo", "Lcom/practicemvvm/model/VideoListResponse;", "app_debug"})
public abstract interface SearchService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "image")
    @retrofit2.http.Headers(value = {"Authorization: KakaoAK 38ab3979bfaba867498075a00461dd53"})
    public abstract io.reactivex.rxjava3.core.Observable<com.practicemvvm.model.ImageListResponse> searchImage(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "vclip")
    @retrofit2.http.Headers(value = {"Authorization: KakaoAK 38ab3979bfaba867498075a00461dd53"})
    public abstract io.reactivex.rxjava3.core.Observable<com.practicemvvm.model.VideoListResponse> searchVideo(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
}