package com.practicemvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/practicemvvm/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/practicemvvm/list/ListAdapter;", "getAdapter", "()Lcom/practicemvvm/list/ListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/practicemvvm/databinding/FragmentSearchBinding;", "viewModel", "Lcom/practicemvvm/SearchViewModel;", "getViewModel", "()Lcom/practicemvvm/SearchViewModel;", "viewModel$delegate", "observeViewModel", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "searchKeyword", "text", "", "Handler", "app_debug"})
public final class SearchFragment extends androidx.fragment.app.Fragment {
    private com.practicemvvm.databinding.FragmentSearchBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    
    public SearchFragment() {
        super();
    }
    
    private final com.practicemvvm.SearchViewModel getViewModel() {
        return null;
    }
    
    private final com.practicemvvm.list.ListAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    public final void searchKeyword(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    private final void observeViewModel() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/practicemvvm/SearchFragment$Handler;", "Lcom/practicemvvm/list/ItemHandler;", "viewModel", "Lcom/practicemvvm/SearchViewModel;", "(Lcom/practicemvvm/SearchViewModel;)V", "onClickFavorite", "", "item", "Lcom/practicemvvm/model/ListItem;", "app_debug"})
    public static final class Handler implements com.practicemvvm.list.ItemHandler {
        private final com.practicemvvm.SearchViewModel viewModel = null;
        
        public Handler(@org.jetbrains.annotations.NotNull
        com.practicemvvm.SearchViewModel viewModel) {
            super();
        }
        
        @java.lang.Override
        public void onClickFavorite(@org.jetbrains.annotations.NotNull
        com.practicemvvm.model.ListItem item) {
        }
    }
}