package com.example.stocknews.ui.news

import androidx.recyclerview.widget.DiffUtil
import com.example.stocknews.data.NewsItem

class DiffutilNewsCallBack: DiffUtil.ItemCallback<NewsItem>(){
    override fun areItemsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.getId()==newItem.getId()
    }

    override fun areContentsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.getId()==newItem.getId()
    }
}