package com.example.fastcampus.chapter10.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fastcampus.chapter10.R
import com.example.fastcampus.chapter10.data.ArticleModel
import com.example.fastcampus.chapter10.databinding.ItemArticleBinding
import com.example.fastcampus.chapter10.ui.bookmark.BookmarkArticleAdapter
import kotlinx.coroutines.internal.artificialFrame

class HomeArticleAdapter(
    private val onItemClicked: (ArticleItem) -> Unit,
    val onBookmarkClicked: (String, Boolean) -> Unit
) : ListAdapter<ArticleItem, HomeArticleAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(private val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ArticleItem) {
            binding.descriptionTextView.text = item.description
            Glide.with(binding.thumbnailImageView)
                .load(item.imageUrl)
                .into(binding.thumbnailImageView)

            binding.root.setOnClickListener {
                onItemClicked(item)
            }
            if (item.isBookMark) {
                binding.bookmakrImageButton.setBackgroundResource(R.drawable.baseline_bookmark_24)
            } else {
                binding.bookmakrImageButton.setBackgroundResource(R.drawable.baseline_bookmark_border_24)
            }
            binding.bookmakrImageButton.setOnClickListener {
                onBookmarkClicked.invoke(item.articleId,item.isBookMark.not())

                item.isBookMark = item.isBookMark.not()
                if (item.isBookMark) {
                    binding.bookmakrImageButton.setBackgroundResource(R.drawable.baseline_bookmark_24)
                } else {
                    binding.bookmakrImageButton.setBackgroundResource(R.drawable.baseline_bookmark_border_24)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemArticleBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ArticleItem>() {
            override fun areItemsTheSame(oldItem: ArticleItem, newItem: ArticleItem): Boolean {
                return oldItem.articleId == newItem.articleId
            }

            override fun areContentsTheSame(oldItem: ArticleItem, newItem: ArticleItem): Boolean {
                return oldItem == newItem
            }

        }
    }


}