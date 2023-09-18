package com.practicemvvm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/practicemvvm/model/ListItem;", "", "dateTime", "Ljava/util/Date;", "getDateTime", "()Ljava/util/Date;", "isFavorite", "", "()Z", "thumbnailUrl", "", "getThumbnailUrl", "()Ljava/lang/String;", "app_debug"})
public abstract interface ListItem {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getThumbnailUrl();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Date getDateTime();
    
    public abstract boolean isFavorite();
}