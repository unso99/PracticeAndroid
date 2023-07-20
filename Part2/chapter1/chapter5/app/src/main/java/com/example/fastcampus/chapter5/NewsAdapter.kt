package com.example.fastcampus.chapter5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fastcampus.chapter5.databinding.ItemNewsBinding

class NewsAdapter(private val onClick: (String) -> Unit ):ListAdapter<NewsModel, NewsAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(private val viewBinding: ItemNewsBinding) : RecyclerView.ViewHolder(viewBinding.root){
        fun bind(item : NewsModel){
            viewBinding.titleTextView.text = item.title
            Glide.with(viewBinding.thumbnailImageView)
                .load(item.imageUrl)
                .into(viewBinding.thumbnailImageView)

            viewBinding.root.setOnClickListener{
                onClick(item.link)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemNewsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object :DiffUtil.ItemCallback<NewsModel>(){
            override fun areItemsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
                return oldItem == newItem
            }

        }
    }
}