package com.example.fastcampus.part3.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/ImageService;", "", "getRandomImage", "Lretrofit2/Call;", "Lcom/example/fastcampus/part3/myapplication/ImageResponse;", "getRandomImageRx", "Lio/reactivex/Single;", "app_debug"})
public abstract interface ImageService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "photos/random")
    @retrofit2.http.Headers(value = {"Authorization: Client-ID AhrX3ZTCa1Rs9BjPsqLTxN8moMLHyK7OzjL74YnlfUI"})
    public abstract retrofit2.Call<com.example.fastcampus.part3.myapplication.ImageResponse> getRandomImage();
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "photos/random")
    @retrofit2.http.Headers(value = {"Authorization: Client-ID AhrX3ZTCa1Rs9BjPsqLTxN8moMLHyK7OzjL74YnlfUI"})
    public abstract io.reactivex.Single<com.example.fastcampus.part3.myapplication.ImageResponse> getRandomImageRx();
}