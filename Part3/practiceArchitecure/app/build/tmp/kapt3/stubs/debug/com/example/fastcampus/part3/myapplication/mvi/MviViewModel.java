package com.example.fastcampus.part3.myapplication.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviViewModel;", "Landroidx/lifecycle/ViewModel;", "imageRepository", "Lcom/example/fastcampus/part3/myapplication/mvi/repository/ImageRepository;", "(Lcom/example/fastcampus/part3/myapplication/mvi/repository/ImageRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviIntent;", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "count", "", "getCount", "()I", "setCount", "(I)V", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleIntent", "", "loadImage", "MviViewModelFactory", "app_debug"})
public final class MviViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.fastcampus.part3.myapplication.mvi.repository.ImageRepository imageRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.example.fastcampus.part3.myapplication.mvi.MviIntent> channel = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.fastcampus.part3.myapplication.mvi.MviState> _state = null;
    private int count = 0;
    
    public MviViewModel(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.myapplication.mvi.repository.ImageRepository imageRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.Channel<com.example.fastcampus.part3.myapplication.mvi.MviIntent> getChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.fastcampus.part3.myapplication.mvi.MviState> getState() {
        return null;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    private final void handleIntent() {
    }
    
    private final void loadImage() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviViewModel$MviViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "imageRepository", "Lcom/example/fastcampus/part3/myapplication/mvi/repository/ImageRepository;", "(Lcom/example/fastcampus/part3/myapplication/mvi/repository/ImageRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class MviViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.example.fastcampus.part3.myapplication.mvi.repository.ImageRepository imageRepository = null;
        
        public MviViewModelFactory(@org.jetbrains.annotations.NotNull
        com.example.fastcampus.part3.myapplication.mvi.repository.ImageRepository imageRepository) {
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