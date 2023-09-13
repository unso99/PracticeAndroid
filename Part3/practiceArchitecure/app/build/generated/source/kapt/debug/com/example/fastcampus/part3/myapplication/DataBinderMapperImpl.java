package com.example.fastcampus.part3.myapplication;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.fastcampus.part3.myapplication.databinding.ActivityMainBindingImpl;
import com.example.fastcampus.part3.myapplication.databinding.ActivityMvcBindingImpl;
import com.example.fastcampus.part3.myapplication.databinding.ActivityMviBindingImpl;
import com.example.fastcampus.part3.myapplication.databinding.ActivityMvpBindingImpl;
import com.example.fastcampus.part3.myapplication.databinding.ActivityMvvmBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMVC = 2;

  private static final int LAYOUT_ACTIVITYMVI = 3;

  private static final int LAYOUT_ACTIVITYMVP = 4;

  private static final int LAYOUT_ACTIVITYMVVM = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fastcampus.part3.myapplication.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fastcampus.part3.myapplication.R.layout.activity_mvc, LAYOUT_ACTIVITYMVC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fastcampus.part3.myapplication.R.layout.activity_mvi, LAYOUT_ACTIVITYMVI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fastcampus.part3.myapplication.R.layout.activity_mvp, LAYOUT_ACTIVITYMVP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fastcampus.part3.myapplication.R.layout.activity_mvvm, LAYOUT_ACTIVITYMVVM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMVC: {
          if ("layout/activity_mvc_0".equals(tag)) {
            return new ActivityMvcBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mvc is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMVI: {
          if ("layout/activity_mvi_0".equals(tag)) {
            return new ActivityMviBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mvi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMVP: {
          if ("layout/activity_mvp_0".equals(tag)) {
            return new ActivityMvpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mvp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMVVM: {
          if ("layout/activity_mvvm_0".equals(tag)) {
            return new ActivityMvvmBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mvvm is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "view");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.fastcampus.part3.myapplication.R.layout.activity_main);
      sKeys.put("layout/activity_mvc_0", com.example.fastcampus.part3.myapplication.R.layout.activity_mvc);
      sKeys.put("layout/activity_mvi_0", com.example.fastcampus.part3.myapplication.R.layout.activity_mvi);
      sKeys.put("layout/activity_mvp_0", com.example.fastcampus.part3.myapplication.R.layout.activity_mvp);
      sKeys.put("layout/activity_mvvm_0", com.example.fastcampus.part3.myapplication.R.layout.activity_mvvm);
    }
  }
}
