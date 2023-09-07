package com.example.fastcampus.part3.myapplication.databinding;
import com.example.fastcampus.part3.myapplication.R;
import com.example.fastcampus.part3.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMvvmBindingImpl extends ActivityMvvmBinding implements com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMvvmBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMvvmBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.imageCountTextView.setTag(null);
        this.imageView.setTag(null);
        this.loadButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.fastcampus.part3.myapplication.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setView((com.example.fastcampus.part3.myapplication.mvvm.MvvmActivity) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.example.fastcampus.part3.myapplication.mvvm.MvvmViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable com.example.fastcampus.part3.myapplication.mvvm.MvvmActivity View) {
        this.mView = View;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.view);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.example.fastcampus.part3.myapplication.mvvm.MvvmViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageLiveData((androidx.lifecycle.LiveData<com.example.fastcampus.part3.myapplication.mvvm.model.Image>) object, fieldId);
            case 1 :
                return onChangeViewModelCountLiveData((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageLiveData(androidx.lifecycle.LiveData<com.example.fastcampus.part3.myapplication.mvvm.model.Image> ViewModelImageLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCountLiveData(androidx.lifecycle.LiveData<java.lang.String> ViewModelCountLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String viewModelCountLiveDataGetValue = null;
        com.example.fastcampus.part3.myapplication.mvvm.model.Image viewModelImageLiveDataGetValue = null;
        com.example.fastcampus.part3.myapplication.mvvm.MvvmActivity view = mView;
        androidx.lifecycle.LiveData<com.example.fastcampus.part3.myapplication.mvvm.model.Image> viewModelImageLiveData = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelCountLiveData = null;
        com.example.fastcampus.part3.myapplication.mvvm.MvvmViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageLiveData
                        viewModelImageLiveData = viewModel.getImageLiveData();
                    }
                    updateLiveDataRegistration(0, viewModelImageLiveData);


                    if (viewModelImageLiveData != null) {
                        // read viewModel.imageLiveData.getValue()
                        viewModelImageLiveDataGetValue = viewModelImageLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.countLiveData
                        viewModelCountLiveData = viewModel.getCountLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelCountLiveData);


                    if (viewModelCountLiveData != null) {
                        // read viewModel.countLiveData.getValue()
                        viewModelCountLiveDataGetValue = viewModelCountLiveData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.imageCountTextView, viewModelCountLiveDataGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.fastcampus.part3.myapplication.mvvm.bindingAdapter.BindingAdapterKt.setImage(this.imageView, viewModelImageLiveDataGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.loadButton.setOnClickListener(mCallback6);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // view
        com.example.fastcampus.part3.myapplication.mvvm.MvvmActivity view = mView;
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
        flag 0 (0x1L): viewModel.imageLiveData
        flag 1 (0x2L): viewModel.countLiveData
        flag 2 (0x3L): view
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}