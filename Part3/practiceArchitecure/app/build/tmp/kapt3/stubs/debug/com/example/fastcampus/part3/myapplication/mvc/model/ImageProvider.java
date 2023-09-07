package com.example.fastcampus.part3.myapplication.mvc.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvc/model/ImageProvider;", "", "callback", "Lcom/example/fastcampus/part3/myapplication/mvc/model/ImageProvider$Callback;", "(Lcom/example/fastcampus/part3/myapplication/mvc/model/ImageProvider$Callback;)V", "getRandomImage", "", "Callback", "app_debug"})
public final class ImageProvider {
    private final com.example.fastcampus.part3.myapplication.mvc.model.ImageProvider.Callback callback = null;
    
    public ImageProvider(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvc.model.ImageProvider.Callback callback) {
        super();
    }
    
    public final void getRandomImage() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvc/model/ImageProvider$Callback;", "", "loadImage", "", "url", "", "color", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void loadImage(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String color);
    }
}