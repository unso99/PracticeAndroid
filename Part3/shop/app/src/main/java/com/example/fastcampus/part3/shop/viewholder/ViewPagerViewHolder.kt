package com.example.fastcampus.part3.shop.viewholder

import com.example.fastcampus.part3.shop.ListAdapter
import com.example.fastcampus.part3.shop.databinding.ItemViewpagerBinding
import com.example.fastcampus.part3.shop.model.ListItem
import com.example.fastcampus.part3.shop.model.ViewPager

class ViewPagerViewHolder(private val binding: ItemViewpagerBinding) :
    BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewPager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }

}