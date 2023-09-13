package com.example.fastcampus.part3.myapplication.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviIntent;", "", "()V", "LoadImage", "Lcom/example/fastcampus/part3/myapplication/mvi/MviIntent$LoadImage;", "app_debug"})
public abstract class MviIntent {
    
    private MviIntent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvi/MviIntent$LoadImage;", "Lcom/example/fastcampus/part3/myapplication/mvi/MviIntent;", "()V", "app_debug"})
    public static final class LoadImage extends com.example.fastcampus.part3.myapplication.mvi.MviIntent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.fastcampus.part3.myapplication.mvi.MviIntent.LoadImage INSTANCE = null;
        
        private LoadImage() {
            super();
        }
    }
}