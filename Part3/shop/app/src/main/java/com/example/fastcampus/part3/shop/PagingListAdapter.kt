package com.example.fastcampus.part3.shop

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import com.example.fastcampus.part3.shop.model.ListItem
import com.example.fastcampus.part3.shop.viewholder.BindingViewHolder
import com.example.fastcampus.part3.shop.viewholder.ViewHolderGenerator

class PagingListAdapter:PagingDataAdapter<ListItem,BindingViewHolder<*>>(DiffCallback()) {
    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return item?.viewType?.ordinal ?: -1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder<*> {
        return ViewHolderGenerator.get(parent, viewType)
    }

    override fun onBindViewHolder(holder: BindingViewHolder<*>, position: Int) {
        val item = getItem(position)
        if (item != null) {
            holder.bind(item)
        }
    }
}