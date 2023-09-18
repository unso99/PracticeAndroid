package com.practicemvvm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/practicemvvm/model/VideoItem;", "Lcom/practicemvvm/model/ListItem;", "thumbnailUrl", "", "title", "playTime", "", "author", "dateTime", "Ljava/util/Date;", "isFavorite", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Z)V", "getAuthor", "()Ljava/lang/String;", "getDateTime", "()Ljava/util/Date;", "()Z", "getPlayTime", "()I", "getThumbnailUrl", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class VideoItem implements com.practicemvvm.model.ListItem {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "thumbnail")
    private final java.lang.String thumbnailUrl = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "title")
    private final java.lang.String title = null;
    @com.google.gson.annotations.SerializedName(value = "play_time")
    private final int playTime = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "author")
    private final java.lang.String author = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "datetime")
    private final java.util.Date dateTime = null;
    private final boolean isFavorite = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.practicemvvm.model.VideoItem copy(@org.jetbrains.annotations.NotNull
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.NotNull
    java.lang.String title, int playTime, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, boolean isFavorite) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public VideoItem(@org.jetbrains.annotations.NotNull
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.NotNull
    java.lang.String title, int playTime, @org.jetbrains.annotations.NotNull
    java.lang.String author, @org.jetbrains.annotations.NotNull
    java.util.Date dateTime, boolean isFavorite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getThumbnailUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPlayTime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Date getDateTime() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @java.lang.Override
    public boolean isFavorite() {
        return false;
    }
}