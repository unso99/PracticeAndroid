package com.practicemvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/practicemvvm/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRepository", "Lcom/practicemvvm/repository/SearchRepository;", "(Lcom/practicemvvm/repository/SearchRepository;)V", "_listLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/practicemvvm/model/ListItem;", "_showLoading", "", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "listLiveData", "Landroidx/lifecycle/LiveData;", "getListLiveData", "()Landroidx/lifecycle/LiveData;", "showLoading", "getShowLoading", "search", "", "query", "", "toggleFavorite", "item", "SearchViewModelFactory", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.practicemvvm.repository.SearchRepository searchRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.practicemvvm.model.ListItem>> _listLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showLoading = null;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.practicemvvm.repository.SearchRepository searchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.practicemvvm.model.ListItem>> getListLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowLoading() {
        return null;
    }
    
    public final void search(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void toggleFavorite(@org.jetbrains.annotations.NotNull
    com.practicemvvm.model.ListItem item) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/practicemvvm/SearchViewModel$SearchViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "searchRepository", "Lcom/practicemvvm/repository/SearchRepository;", "(Lcom/practicemvvm/repository/SearchRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class SearchViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final com.practicemvvm.repository.SearchRepository searchRepository = null;
        
        public SearchViewModelFactory(@org.jetbrains.annotations.NotNull
        com.practicemvvm.repository.SearchRepository searchRepository) {
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