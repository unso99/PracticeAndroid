package com.practicemvvm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.practicemvvm.databinding.ActivityMainBindingImpl;
import com.practicemvvm.databinding.FragmentFavoritesBindingImpl;
import com.practicemvvm.databinding.FragmentSearchBindingImpl;
import com.practicemvvm.databinding.ItemImageBindingImpl;
import com.practicemvvm.databinding.ItemVideoBindingImpl;
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

  private static final int LAYOUT_FRAGMENTFAVORITES = 2;

  private static final int LAYOUT_FRAGMENTSEARCH = 3;

  private static final int LAYOUT_ITEMIMAGE = 4;

  private static final int LAYOUT_ITEMVIDEO = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.practicemvvm.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.practicemvvm.R.layout.fragment_favorites, LAYOUT_FRAGMENTFAVORITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.practicemvvm.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.practicemvvm.R.layout.item_image, LAYOUT_ITEMIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.practicemvvm.R.layout.item_video, LAYOUT_ITEMVIDEO);
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
        case  LAYOUT_FRAGMENTFAVORITES: {
          if ("layout/fragment_favorites_0".equals(tag)) {
            return new FragmentFavoritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorites is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMIMAGE: {
          if ("layout/item_image_0".equals(tag)) {
            return new ItemImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMVIDEO: {
          if ("layout/item_video_0".equals(tag)) {
            return new ItemVideoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_video is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "item");
      sKeys.put(3, "view");
      sKeys.put(4, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.practicemvvm.R.layout.activity_main);
      sKeys.put("layout/fragment_favorites_0", com.practicemvvm.R.layout.fragment_favorites);
      sKeys.put("layout/fragment_search_0", com.practicemvvm.R.layout.fragment_search);
      sKeys.put("layout/item_image_0", com.practicemvvm.R.layout.item_image);
      sKeys.put("layout/item_video_0", com.practicemvvm.R.layout.item_video);
    }
  }
}
