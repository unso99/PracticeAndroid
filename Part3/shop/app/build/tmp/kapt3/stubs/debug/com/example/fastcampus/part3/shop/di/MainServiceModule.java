package com.example.fastcampus.part3.shop.di;

import com.example.fastcampus.part3.shop.remote.MainService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/fastcampus/part3/shop/di/MainServiceModule;", "", "()V", "providesMainService", "Lcom/example/fastcampus/part3/shop/remote/MainService;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
@dagger.Module
public final class MainServiceModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.fastcampus.part3.shop.di.MainServiceModule INSTANCE = null;
    
    private MainServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.fastcampus.part3.shop.remote.MainService providesMainService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}