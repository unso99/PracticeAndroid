package com.practicemvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"setDateText", "", "Landroid/widget/TextView;", "date", "Ljava/util/Date;", "setFavorite", "Landroid/widget/ImageView;", "isFavorite", "", "setImage", "imageUrl", "", "setVisible", "Landroid/view/View;", "isShow", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"image"})
    public static final void setImage(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setImage, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"visible"})
    public static final void setVisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$setVisible, boolean isShow) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"date"})
    public static final void setDateText(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setDateText, @org.jetbrains.annotations.Nullable
    java.util.Date date) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"favorite"})
    public static final void setFavorite(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setFavorite, boolean isFavorite) {
    }
}