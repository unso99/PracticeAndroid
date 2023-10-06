package com.example.fastcampus.part3.shop.viewholder

import com.example.fastcampus.part3.shop.ListAdapter
import com.example.fastcampus.part3.shop.databinding.ItemHoriziontalBinding
import com.example.fastcampus.part3.shop.model.Horizontal
import com.example.fastcampus.part3.shop.model.ListItem

class HorizontalViewHolder(private val binding: ItemHoriziontalBinding) :
    BindingViewHolder<ItemHoriziontalBinding>(binding) {
    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}