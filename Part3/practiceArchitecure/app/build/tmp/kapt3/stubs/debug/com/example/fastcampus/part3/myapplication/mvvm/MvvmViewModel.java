package com.example.fastcampus.part3.myapplication.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvvm/MvvmViewModel;", "Landroidx/lifecycle/ViewModel;", "imageRepository", "Lcom/example/fastcampus/part3/myapplication/mvvm/repository/ImageRepository;", "(Lcom/example/fastcampus/part3/myapplication/mvvm/repository/ImageRepository;)V", "_countLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_imageLiveData", "Lcom/example/fastcampus/part3/myapplication/mvvm/model/Image;", "count", "", "countLiveData", "Landroidx/lifecycle/LiveData;", "getCountLiveData", "()Landroidx/lifecycle/LiveData;", "countLiveData$delegate", "Lkotlin/Lazy;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "imageLiveData", "getImageLiveData", "imageLiveData$delegate", "loadImage", "", "onCleared", "MvvmViewModelFactory", "app_debug"})
public final class MvvmViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepository imageRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _countLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy countLiveData$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.example.fastcampus.part3.myapplication.mvvm.model.Image> _imageLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy imageLiveData$delegate = null;
    private io.reactivex.disposables.CompositeDisposable disposable;
    private int count = 0;
    
    public MvvmViewModel(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepository imageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getCountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.fastcampus.part3.myapplication.mvvm.model.Image> getImageLiveData() {
        return null;
    }
    
    public final void loadImage() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvvm/MvvmViewModel$MvvmViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "imageRepository", "Lcom/example/fastcampus/part3/myapplication/mvvm/repository/ImageRepository;", "(Lcom/example/fastcampus/part3/myapplication/mvvm/repository/ImageRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class MvvmViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepository imageRepository = null;
        
        public MvvmViewModelFactory(@org.jetbrains.annotations.NotNull
        com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepository imageRepository) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}