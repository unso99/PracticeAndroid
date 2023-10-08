package com.example.fastcampus.part3.shop;

import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.example.fastcampus.part3.shop.model.ListItem;
import com.example.fastcampus.part3.shop.viewholder.BindingViewHolder;
import com.example.fastcampus.part3.shop.viewholder.ViewHolderGenerator;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/fastcampus/part3/shop/PagingListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/fastcampus/part3/shop/model/ListItem;", "Lcom/example/fastcampus/part3/shop/viewholder/BindingViewHolder;", "()V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class PagingListAdapter extends androidx.paging.PagingDataAdapter<com.example.fastcampus.part3.shop.model.ListItem, com.example.fastcampus.part3.shop.viewholder.BindingViewHolder<?>> {
    
    public PagingListAdapter() {
        super(null, null);
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.fastcampus.part3.shop.viewholder.BindingViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.fastcampus.part3.shop.viewholder.BindingViewHolder<?> holder, int position) {
    }
}