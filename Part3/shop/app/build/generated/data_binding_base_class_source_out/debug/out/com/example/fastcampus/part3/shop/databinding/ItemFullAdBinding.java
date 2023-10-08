// Generated by data binding compiler. Do not edit!
package com.example.fastcampus.part3.shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.fastcampus.part3.shop.R;
import com.example.fastcampus.part3.shop.model.FullAd;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemFullAdBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final AppCompatTextView titleTextView;

  @Bindable
  protected FullAd mItem;

  protected ItemFullAdBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imageView, AppCompatTextView titleTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.titleTextView = titleTextView;
  }

  public abstract void setItem(@Nullable FullAd item);

  @Nullable
  public FullAd getItem() {
    return mItem;
  }

  @NonNull
  public static ItemFullAdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_full_ad, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemFullAdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemFullAdBinding>inflateInternal(inflater, R.layout.item_full_ad, root, attachToRoot, component);
  }

  @NonNull
  public static ItemFullAdBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_full_ad, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemFullAdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemFullAdBinding>inflateInternal(inflater, R.layout.item_full_ad, null, false, component);
  }

  public static ItemFullAdBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemFullAdBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemFullAdBinding)bind(component, view, R.layout.item_full_ad);
  }
}
