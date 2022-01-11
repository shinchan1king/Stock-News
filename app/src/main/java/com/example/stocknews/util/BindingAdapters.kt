package com.example.stocknews.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.stocknews.R

class BindingAdapters {
    companion object {
        @JvmStatic
        @BindingAdapter("glide_url")
        fun LoadImg(imgView: ImageView, url: String) {
            Glide.with(imgView.context).load(url).into(imgView)
        }

        @JvmStatic
        @BindingAdapter("Set_Background")
        fun setBackGround(imgView: ImageView, color: String) {
            when (color) {
                "RED" -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.red))
                }
                "BLACK" -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.black))
                }
                "PURPLE" -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.purple))
                }
                "YELLOW" -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.yellow))
                }
                "BLUE" -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.blue))
                }
                else -> {
                    imgView.setBackgroundColor(imgView.context.resources.getColor(R.color.red))
                }

            }

        }
    }
}