package com.example.stocknews.ui

import android.os.Bundle
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stocknews.R
import com.example.stocknews.data.*
import com.example.stocknews.ui.news.DiffutilNewsCallBack
import com.example.stocknews.ui.news.NewsListAdapter

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random


class NewsListFragment : Fragment() {

    var listNewsImage: MutableList<String> = ArrayList()
    var listNewsTitles: MutableList<String> = ArrayList()
    var listUserNames: MutableList<String> = ArrayList()
    var listNewsDescription:MutableList<String> =ArrayList()
    var length=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView:RecyclerView=view.findViewById(R.id.rv_list_news)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(GridLayoutManager(getContext(),2))
        val adapter= NewsListAdapter( DiffutilNewsCallBack())
        recyclerView.setAdapter(adapter)
        val url= "https://newsapi.org/v2/everything?" +
                "q=Apple&" +
                "from=2022-01-01&" +
                "sortBy=popularity&" +
                "apiKey=10b2687f936a4a33b2f20802819b616c"
        val news: Call<News> =NewsService.newsInstance.getHeadlines("in",1)
        news.enqueue(object :Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {
                val news=response.body()
                if(news!=null)
                {
                    Log.d("Success",news.toString())

                    var articles: List<Article> =news.articles
                    length=articles.size
                    for(i in 0..articles.size-1 )
                    {


                        var author:String=""
                        var title:String=""
                        var description:String=""
                        var urlToImage:String=""
                        var url:String=""
                        if(articles[i].author!=null)
                        {
                            author=articles[i].author
                        }
                        if(articles[i].title!=null)
                        {
                            title=articles[i].title
                        }
                        if(articles[i].description!=null)
                        {
                            description=articles[i].description
                        }
                        if(articles[i].url!=null)
                        {
                            url=articles[i].url
                        }
                        if(articles[i].urlToImage!=null)
                        {
                           urlToImage= articles[i].urlToImage
                        }
                        insertData(author,title,description,url,urlToImage)
                    }
                    adapter.submitList(getListNews())
                }
            }

            override fun onFailure(call: Call<News>, t: Throwable) {

                Log.d("Error","error in fetching")
            }

        })



    }

    fun NewsListFragment()
    {

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_list, container, false)
    }
    fun insertData( author:String, title:String, description:String, url:String, urlToImage:String)
    {

        listUserNames.add(author)
        listNewsDescription.add(description)
        listNewsImage.add(urlToImage)
        listNewsTitles.add(title)
    }

    fun getListNews(): List<NewsItem> {
        val data: MutableList<NewsItem> = ArrayList()
        for (index in 0..length-1) {
            val item = NewsItem(index,
                listNewsTitles[index],
                listUserNames[index],
                listNewsImage[index],

                listNewsDescription[index],
                getRandomBgColor(),
                "",
                1)
            data.add(item)
        }
        return data
    }
    val lstColors = arrayOf("RED", "YELLOW", "BLACK", "PURPLE")
    private fun getRandomBgColor(): String {
        val index: Int = Random.nextInt(lstColors.size)
        return lstColors[index]
    }
}