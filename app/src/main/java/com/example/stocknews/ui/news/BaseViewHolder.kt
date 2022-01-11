package com.example.stocknews.ui.news

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.stocknews.data.NewsItem
import com.example.stocknews.databinding.ItemsNewsImageBinding
import com.example.stocknews.databinding.ItemsNewsTextBinding

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    open fun bindData(item:NewsItem)
    {

    }
    open fun getItemNewsTextBinding() : ItemsNewsTextBinding? {
        return null
    }
    open fun getItemNewsImageBinding(): ItemsNewsImageBinding?
    {
        return null
    }
}