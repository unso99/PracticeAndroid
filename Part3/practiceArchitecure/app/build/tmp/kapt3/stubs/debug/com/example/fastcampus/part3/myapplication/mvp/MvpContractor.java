package com.example.fastcampus.part3.myapplication.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor;", "", "Presenter", "View", "app_debug"})
public abstract interface MvpContractor {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$View;", "", "showImage", "", "url", "", "color", "showImageCountText", "count", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void showImage(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String color);
        
        public abstract void showImageCountText(int count);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$Presenter;", "", "attachView", "", "view", "Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$View;", "detachView", "loadRandomImage", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull
        com.example.fastcampus.part3.myapplication.mvp.MvpContractor.View view);
        
        public abstract void detachView();
        
        public abstract void loadRandomImage();
    }
}