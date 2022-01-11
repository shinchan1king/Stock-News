package com.example.stocknews.ui.news
import android.media.browse.MediaBrowser
import android.support.v4.media.MediaBrowserCompat
import android.view.LayoutInflater
import androidx.annotation.NonNull
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.example.stocknews.R
import com.example.stocknews.R.*
import com.example.stocknews.data.NewsItem
import com.example.stocknews.databinding.ItemsNewsImageBinding
import com.example.stocknews.databinding.ItemsNewsTextBinding
import java.security.AccessController.getContext


class NewsListAdapter :ListAdapter<NewsItem, BaseViewHolder> {
     lateinit var listener:OnNewsItemClickEvent
     val VIEWTYPE_NEWS_TEXT=0;
     val VIEWTYPE_NEWS_IMAGE=1;
     val VIEWTYPE_NEWS_VIDEO=2;

     constructor(  diffCallBack: DiffUtil.ItemCallback<NewsItem> ) : super(diffCallBack) {
          diffCallBack
     }
    fun setOnNewsItemClickListener(listener:OnNewsItemClickEvent)
    {
        this.listener=listener
    }
     override fun getItemViewType(position: Int): Int {
         return getItem(position).getviewType()!!
     }
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder
     {
       when(viewType)
       {
            VIEWTYPE_NEWS_TEXT->
            {val itemNewsTextBinding:ItemsNewsTextBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.items_news_text,parent,false)
                return TextViewHolder(itemNewsTextBinding)
            }
           VIEWTYPE_NEWS_IMAGE->
           {
               val itemNewsImageBinding:ItemsNewsImageBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.items_news_image,parent,false)
               return ImageViewHolder(itemNewsImageBinding)
           }
           else->
           {
               val defaultItemNewsTextBinding:ItemsNewsTextBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.items_news_text,parent,false)
               return TextViewHolder(defaultItemNewsTextBinding)
           }
       }


    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }

     interface OnNewsItemClickEvent{
         fun onItemTextClick()
         fun onItemImageClick()
         fun onItemLongClick()

     }
}