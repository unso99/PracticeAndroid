package com.example.fastcampus.part3.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampus.part3.myapplication.databinding.ItemDetailBinding

class DetailListAdapter : ListAdapter<DetailItem, DetailListAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(private val binding: ItemDetailBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: DetailItem) {
            binding.item = item
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<DetailItem>() {
            override fun areItemsTheSame(oldItem: DetailItem, newItem: DetailItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: DetailItem, newItem: DetailItem): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDetailBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}