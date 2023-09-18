package com.practicemvvm.databinding;
import com.practicemvvm.R;
import com.practicemvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemVideoBindingImpl extends ItemVideoBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemVideoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemVideoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.authorTextView.setTag(null);
        this.dateTextView.setTag(null);
        this.favoriteImageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.playTimeTextView.setTag(null);
        this.thumbnailImageView.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.item == variableId) {
            setItem((com.practicemvvm.model.VideoItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.practicemvvm.model.VideoItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
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
        com.practicemvvm.model.VideoItem item = mItem;
        java.lang.String itemPlayTimeJavaLangString = null;
        boolean itemFavorite = false;
        java.lang.String itemTitle = null;
        java.lang.String itemAuthor = null;
        java.util.Date itemDateTime = null;
        java.lang.String itemThumbnailUrl = null;
        int itemPlayTime = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.favorite
                    itemFavorite = item.isFavorite();
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.author
                    itemAuthor = item.getAuthor();
                    // read item.dateTime
                    itemDateTime = item.getDateTime();
                    // read item.thumbnailUrl
                    itemThumbnailUrl = item.getThumbnailUrl();
                    // read item.playTime
                    itemPlayTime = item.getPlayTime();
                }


                // read (item.playTime) + ("초")
                itemPlayTimeJavaLangString = (itemPlayTime) + ("초");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.authorTextView, itemAuthor);
            com.practicemvvm.BindingAdapterKt.setDateText(this.dateTextView, itemDateTime);
            com.practicemvvm.BindingAdapterKt.setFavorite(this.favoriteImageView, itemFavorite);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.playTimeTextView, itemPlayTimeJavaLangString);
            com.practicemvvm.BindingAdapterKt.setImage(this.thumbnailImageView, itemThumbnailUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, itemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}