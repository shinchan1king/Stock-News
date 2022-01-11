package com.example.stocknews.ui.news

import android.view.View
import com.example.stocknews.data.NewsItem
import com.example.stocknews.databinding.ItemsNewsImageBinding

class ImageViewHolder(itemView: View) :BaseViewHolder(itemView)
{
    lateinit var itemsNewsImageBinding:ItemsNewsImageBinding
    constructor(itemsNewsImageBinding: ItemsNewsImageBinding) : this(itemsNewsImageBinding.root) {
        this.itemsNewsImageBinding=itemsNewsImageBinding
    }
    override fun bindData(item: NewsItem)
    {
       itemsNewsImageBinding.newsItemImage
    }
}