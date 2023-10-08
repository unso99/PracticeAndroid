package com.example.fastcampus.part3.shop.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient.Builder> okHttpClientProvider;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  public RetrofitModule_ProvidesRetrofitFactory(Provider<OkHttpClient.Builder> okHttpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(okHttpClientProvider.get(), gsonConverterFactoryProvider.get());
  }

  public static RetrofitModule_ProvidesRetrofitFactory create(
      Provider<OkHttpClient.Builder> okHttpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    return new RetrofitModule_ProvidesRetrofitFactory(okHttpClientProvider, gsonConverterFactoryProvider);
  }

  public static Retrofit providesRetrofit(OkHttpClient.Builder okHttpClient,
      GsonConverterFactory gsonConverterFactory) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.providesRetrofit(okHttpClient, gsonConverterFactory));
  }
}
