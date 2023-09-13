package com.example.fastcampus.part3.myapplication.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviState;", "", "()V", "Idle", "LoadedImage", "Loading", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState$Idle;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState$LoadedImage;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState$Loading;", "app_debug"})
public abstract class MviState {
    
    private MviState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviState$Idle;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState;", "()V", "app_debug"})
    public static final class Idle extends com.example.fastcampus.part3.myapplication.mvi.MviState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.fastcampus.part3.myapplication.mvi.MviState.Idle INSTANCE = null;
        
        private Idle() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviState$Loading;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState;", "()V", "app_debug"})
    public static final class Loading extends com.example.fastcampus.part3.myapplication.mvi.MviState {
        @org.jetbrains.annotations.NotNull
        public static final com.example.fastcampus.part3.myapplication.mvi.MviState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviState$LoadedImage;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviState;", "image", "Lcom/example/fastcampus/part3/myapplication/mvi/model/Image;", "count", "", "(Lcom/example/fastcampus/part3/myapplication/mvi/model/Image;I)V", "getCount", "()I", "getImage", "()Lcom/example/fastcampus/part3/myapplication/mvi/model/Image;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class LoadedImage extends com.example.fastcampus.part3.myapplication.mvi.MviState {
        @org.jetbrains.annotations.NotNull
        private final com.example.fastcampus.part3.myapplication.mvi.model.Image image = null;
        private final int count = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.fastcampus.part3.myapplication.mvi.MviState.LoadedImage copy(@org.jetbrains.annotations.NotNull
        com.example.fastcampus.part3.myapplication.mvi.model.Image image, int count) {
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
        
        public LoadedImage(@org.jetbrains.annotations.NotNull
        com.example.fastcampus.part3.myapplication.mvi.model.Image image, int count) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.fastcampus.part3.myapplication.mvi.model.Image component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.fastcampus.part3.myapplication.mvi.model.Image getImage() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getCount() {
            return 0;
        }
    }
}