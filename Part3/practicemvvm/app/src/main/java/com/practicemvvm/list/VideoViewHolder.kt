package com.practicemvvm.list

import androidx.recyclerview.widget.RecyclerView
import com.practicemvvm.databinding.ItemVideoBinding
import com.practicemvvm.model.ListItem
import com.practicemvvm.model.VideoItem

class VideoViewHolder(
    private val binding: ItemVideoBinding,
    private val itemHandler: ItemHandler? = null
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ListItem) {
        item as VideoItem
        binding.item = item
        binding.handler = itemHandler
    }
}