package com.example.fastcampus.chapter8

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampus.chapter8.databinding.ItemImageBinding
import com.example.fastcampus.chapter8.databinding.ItemLoadMoreBinding

class ImageAdapter(private val itemClickListener: ItemClickListener) : ListAdapter<ImageItems, RecyclerView.ViewHolder>(
    object : DiffUtil.ItemCallback<ImageItems>() {
        //같은 item을 참조하고 있는지 확인하는 부분
        override fun areItemsTheSame(oldItem: ImageItems, newItem: ImageItems): Boolean {
            return oldItem === newItem
        }
        // 데이터가 같은지
        override fun areContentsTheSame(oldItem: ImageItems, newItem: ImageItems): Boolean {
            return oldItem == newItem
        }

    }
) {

    override fun getItemCount(): Int {
        val originalSize = currentList.size
        return if(originalSize == 0) 0 else originalSize.inc()
    }

    override fun getItemViewType(position: Int): Int {
        return if(itemCount.dec() == position) ITEM_LOAD_MORE else ITEM_IMAGE

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        return when(viewType){
            ITEM_IMAGE ->{
                val binding = ItemImageBinding.inflate(inflater,parent,false)
                ImageViewHolder(binding)

            }
            else -> {
                val binding = ItemLoadMoreBinding.inflate(inflater,parent,false)
                LoadMoreViewHolder(binding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ImageViewHolder->{
                holder.bind(currentList[position] as ImageItems.Image)
            }
            is LoadMoreViewHolder-> {
                holder.bind(itemClickListener)
            }
        }
    }


    interface ItemClickListener{
        fun onLoadMoreClick()
    }
    companion object{
        const val ITEM_IMAGE = 0
        const val ITEM_LOAD_MORE = 1
    }
}


sealed class ImageItems {
    data class Image(
        val uri: Uri,
    ) : ImageItems()

    object LoadMore : ImageItems()
}

class ImageViewHolder(private val binding : ItemImageBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(item:ImageItems.Image){
        binding.previewImageView.setImageURI(item.uri)
    }
}

class LoadMoreViewHolder(binding : ItemLoadMoreBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(itemClickListener: ImageAdapter.ItemClickListener){
        itemView.setOnClickListener { itemClickListener.onLoadMoreClick() }
    }
}
