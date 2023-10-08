package com.example.fastcampus.part3.shop.di;

import com.example.fastcampus.part3.shop.model.ListItem;
import com.example.fastcampus.part3.shop.remote.ListItemDeserializer;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/fastcampus/part3/shop/di/RetrofitModule;", "", "()V", "providesConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "providesOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "providesRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "gsonConverterFactory", "app_debug"})
@dagger.Module
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.fastcampus.part3.shop.di.RetrofitModule INSTANCE = null;
    
    private RetrofitModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.converter.gson.GsonConverterFactory providesConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient.Builder providesOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient.Builder okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
}