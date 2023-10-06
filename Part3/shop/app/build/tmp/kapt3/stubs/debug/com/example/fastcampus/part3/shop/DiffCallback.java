package com.example.fastcampus.part3.shop;

import androidx.recyclerview.widget.DiffUtil;
import com.example.fastcampus.part3.shop.model.ListItem;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/example/fastcampus/part3/shop/DiffCallback;", "T", "Lcom/example/fastcampus/part3/shop/model/ListItem;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Lcom/example/fastcampus/part3/shop/model/ListItem;Lcom/example/fastcampus/part3/shop/model/ListItem;)Z", "areItemsTheSame", "app_debug"})
public final class DiffCallback<T extends com.example.fastcampus.part3.shop.model.ListItem> extends androidx.recyclerview.widget.DiffUtil.ItemCallback<T> {
    
    public DiffCallback() {
        super();
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    T oldItem, @org.jetbrains.annotations.NotNull
    T newItem) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    T oldItem, @org.jetbrains.annotations.NotNull
    T newItem) {
        return false;
    }
}