package com.example.fastcampus.part3.shop.di

import com.example.fastcampus.part3.shop.remote.MainService
import com.example.fastcampus.part3.shop.remote.repository.MainRepository
import com.example.fastcampus.part3.shop.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class MainRepositoryModule {

    @ViewModelScoped
    @Provides
    fun providesMainRepository(
        mainService: MainService
    ): MainRepository = MainRepositoryImpl(mainService)
}