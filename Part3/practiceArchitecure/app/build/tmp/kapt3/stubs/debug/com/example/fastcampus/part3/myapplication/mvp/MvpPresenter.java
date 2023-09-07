package com.example.fastcampus.part3.myapplication.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/MvpPresenter;", "Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$Presenter;", "Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository$Callback;", "model", "Lcom/example/fastcampus/part3/myapplication/mvp/model/ImageCountModel;", "imageRepository", "Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository;", "(Lcom/example/fastcampus/part3/myapplication/mvp/model/ImageCountModel;Lcom/example/fastcampus/part3/myapplication/mvp/repository/ImageRepository;)V", "view", "Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$View;", "attachView", "", "detachView", "loadImage", "url", "", "color", "loadRandomImage", "app_debug"})
public final class MvpPresenter implements com.example.fastcampus.part3.myapplication.mvp.MvpContractor.Presenter, com.example.fastcampus.part3.myapplication.mvp.repository.ImageRepository.Callback {
    private final com.example.fastcampus.part3.myapplication.mvp.model.ImageCountModel model = null;
    private final com.example.fastcampus.part3.myapplication.mvp.repository.ImageRepository imageRepository = null;
    private com.example.fastcampus.part3.myapplication.mvp.MvpContractor.View view;
    
    public MvpPresenter(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvp.model.ImageCountModel model, @org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvp.repository.ImageRepository imageRepository) {
        super();
    }
    
    @java.lang.Override
    public void attachView(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvp.MvpContractor.View view) {
    }
    
    @java.lang.Override
    public void detachView() {
    }
    
    @java.lang.Override
    public void loadRandomImage() {
    }
    
    @java.lang.Override
    public void loadImage(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String color) {
    }
}