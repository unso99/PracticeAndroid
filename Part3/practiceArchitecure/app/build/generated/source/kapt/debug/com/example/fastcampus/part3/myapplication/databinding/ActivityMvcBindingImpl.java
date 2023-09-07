package com.example.fastcampus.part3.myapplication.databinding;
import com.example.fastcampus.part3.myapplication.R;
import com.example.fastcampus.part3.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMvcBindingImpl extends ActivityMvcBinding implements com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 2);
        sViewsWithIds.put(R.id.imageCountTextView, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMvcBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMvcBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.Button) bindings[1]
            );
        this.loadButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 1);
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
            setView((com.example.fastcampus.part3.myapplication.mvc.controller.MvcActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable com.example.fastcampus.part3.myapplication.mvc.controller.MvcActivity View) {
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
        com.example.fastcampus.part3.myapplication.mvc.controller.MvcActivity view = mView;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.loadButton.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // view
        com.example.fastcampus.part3.myapplication.mvc.controller.MvcActivity view = mView;
        // view != null
        boolean viewJavaLangObjectNull = false;



        viewJavaLangObjectNull = (view) != (null);
        if (viewJavaLangObjectNull) {


            view.loadImage();
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