package com.example.fastcampus.part3.shop.di;

import com.example.fastcampus.part3.shop.remote.MainService;
import com.example.fastcampus.part3.shop.remote.repository.MainRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ViewModelScoped")
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
public final class MainRepositoryModule_ProvidesMainRepositoryFactory implements Factory<MainRepository> {
  private final MainRepositoryModule module;

  private final Provider<MainService> mainServiceProvider;

  public MainRepositoryModule_ProvidesMainRepositoryFactory(MainRepositoryModule module,
      Provider<MainService> mainServiceProvider) {
    this.module = module;
    this.mainServiceProvider = mainServiceProvider;
  }

  @Override
  public MainRepository get() {
    return providesMainRepository(module, mainServiceProvider.get());
  }

  public static MainRepositoryModule_ProvidesMainRepositoryFactory create(
      MainRepositoryModule module, Provider<MainService> mainServiceProvider) {
    return new MainRepositoryModule_ProvidesMainRepositoryFactory(module, mainServiceProvider);
  }

  public static MainRepository providesMainRepository(MainRepositoryModule instance,
      MainService mainService) {
    return Preconditions.checkNotNullFromProvides(instance.providesMainRepository(mainService));
  }
}
