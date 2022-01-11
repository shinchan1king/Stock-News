package com.example.stocknews.ui.news

import android.view.View
import com.example.stocknews.data.NewsItem
import com.example.stocknews.databinding.ItemsNewsImageBinding
import com.example.stocknews.databinding.ItemsNewsTextBinding

class TextViewHolder(itemView:View) : BaseViewHolder(itemView) {
    var itemsNewsTextBinding:ItemsNewsTextBinding?=null;
    constructor(itemsNewsTextBinding: ItemsNewsTextBinding) : this(itemsNewsTextBinding.root)
    {
        this.itemsNewsTextBinding=itemsNewsTextBinding
    }

    override fun bindData(item: NewsItem)
    {
        itemsNewsTextBinding?.newsItemText
    }
 override   fun getItemNewsTextBinding() : ItemsNewsTextBinding? {
        return null
    }
  override  fun getItemNewsImageBinding(): ItemsNewsImageBinding?
    {
        return null
    }
}