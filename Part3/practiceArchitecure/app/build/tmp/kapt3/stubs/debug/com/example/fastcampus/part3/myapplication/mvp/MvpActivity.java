package com.example.fastcampus.part3.myapplication.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/fastcampus/part3/myapplication/mvp/MvpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$View;", "()V", "binding", "Lcom/example/fastcampus/part3/myapplication/databinding/ActivityMvpBinding;", "presenter", "Lcom/example/fastcampus/part3/myapplication/mvp/MvpContractor$Presenter;", "loadImage", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showImage", "url", "", "color", "showImageCountText", "count", "", "app_debug"})
public final class MvpActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.fastcampus.part3.myapplication.mvp.MvpContractor.View {
    private com.example.fastcampus.part3.myapplication.databinding.ActivityMvpBinding binding;
    private com.example.fastcampus.part3.myapplication.mvp.MvpContractor.Presenter presenter;
    
    public MvpActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    public void showImage(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String color) {
    }
    
    @java.lang.Override
    public void showImageCountText(int count) {
    }
    
    public final void loadImage() {
    }
}