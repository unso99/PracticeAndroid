package com.practicemvvm.list

import androidx.recyclerview.widget.RecyclerView
import com.practicemvvm.databinding.ItemImageBinding
import com.practicemvvm.model.ImageItem
import com.practicemvvm.model.ListItem

class ImageViewHolder(private val binding: ItemImageBinding,private val itemHandler: ItemHandler? = null) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as ImageItem
        binding.item = item
        binding.handler = itemHandler
    }
}