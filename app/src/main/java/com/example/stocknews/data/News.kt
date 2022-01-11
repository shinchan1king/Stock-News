package com.example.stocknews.data

data class News (val totalResults:Int,val articles: List<Article>)
{
    fun getResults():Int{
        return totalResults
    }
}
