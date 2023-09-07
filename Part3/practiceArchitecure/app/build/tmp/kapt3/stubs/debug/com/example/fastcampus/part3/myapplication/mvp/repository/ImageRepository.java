package com.example.fastcampus.part3.myapplication.mvp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository;", "", "getRandomImage", "", "callback", "Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository$Callback;", "Callback", "app_debug"})
public abstract interface ImageRepository {
    
    public abstract void getRandomImage(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvp.repository.ImageRepository.Callback callback);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository$Callback;", "", "loadImage", "", "url", "", "color", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void loadImage(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String color);
    }
}