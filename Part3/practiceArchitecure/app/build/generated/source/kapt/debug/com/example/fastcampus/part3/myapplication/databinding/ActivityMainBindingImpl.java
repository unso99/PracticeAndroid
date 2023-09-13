package com.example.fastcampus.part3.myapplication.databinding;
import com.example.fastcampus.part3.myapplication.R;
import com.example.fastcampus.part3.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    @NonNull
    private final android.widget.Button mboundView3;
    @NonNull
    private final android.widget.Button mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 4);
        mCallback1 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.view == variableId) {
            setView((com.example.fastcampus.part3.myapplication.MainActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable com.example.fastcampus.part3.myapplication.MainActivity View) {
        this.mView = View;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.view);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.fastcampus.part3.myapplication.MainActivity view = mView;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
            this.mboundView2.setOnClickListener(mCallback2);
            this.mboundView3.setOnClickListener(mCallback3);
            this.mboundView4.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // view
                com.example.fastcampus.part3.myapplication.MainActivity view = mView;
                // view != null
                boolean viewJavaLangObjectNull = false;



                viewJavaLangObjectNull = (view) != (null);
                if (viewJavaLangObjectNull) {


                    view.openMvvm();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // view
                com.example.fastcampus.part3.myapplication.MainActivity view = mView;
                // view != null
                boolean viewJavaLangObjectNull = false;



                viewJavaLangObjectNull = (view) != (null);
                if (viewJavaLangObjectNull) {


                    view.openMvi();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // view
                com.example.fastcampus.part3.myapplication.MainActivity view = mView;
                // view != null
                boolean viewJavaLangObjectNull = false;



                viewJavaLangObjectNull = (view) != (null);
                if (viewJavaLangObjectNull) {


                    view.openMvc();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // view
                com.example.fastcampus.part3.myapplication.MainActivity view = mView;
                // view != null
                boolean viewJavaLangObjectNull = false;



                viewJavaLangObjectNull = (view) != (null);
                if (viewJavaLangObjectNull) {


                    view.openMvp();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): view
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}