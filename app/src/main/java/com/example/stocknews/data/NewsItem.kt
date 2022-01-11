package com.example.stocknews.data

import java.util.*

class NewsItem {

     var id:Int=1
     var title: String ="abc"
    var username: String ="abc"
    var newsImg:String="abc"
    var userImage:String="abc"
    var content:String="abc"
    var bgColor:String="abc"
    var dateCreation: String="abc"
    var viewType:Int=0//required to determine the viewType 0 for simple news type (text based news)1 for image based news and 2 for news that contains video
    var videoUrl:String="abc"
    var isfav:Boolean=false

   constructor(
       id: Int,
       title: String,
       username: String,
       newsImg: String,

       content: String,
       bgColor: String,
       dateCreation: String,
       viewType: Int
    ) {
        this.id = id
        this.title = title
        this.username = username
        this.newsImg = newsImg

        this.content = content
        this.bgColor = bgColor
        this.dateCreation = dateCreation
        this.viewType = viewType
    }

    constructor(id: Int, title: String, username: String, newsImg: String, content: String, bgColor: String, dateCreation: String, viewType: Int, videoUrl: String, isfav: Boolean) {
        this.id = id
        this.title = title
        this.username = username
        this.newsImg = newsImg

        this.content = content
        this.bgColor = bgColor
        this.dateCreation = dateCreation
        this.viewType = viewType
        this.videoUrl = videoUrl
        this.isfav = isfav
    }


    fun NewsItem()
    {

    }

    @JvmName("getId1")
    fun getId(): Int {
        return id
    }
    @JvmName("setId1")
    fun setId(id:Int){
        this.id=id

    }
    @JvmName("getTitle1")
    fun getTitle(): String {
        return title
    }
    @JvmName("setTitle1")
    fun setTitle(title: String){
        this.title=title

    }
    fun getusername(): String {
        return username
    }
    fun setusername(username: String){
        this.username=username

    }
    fun getnewsImg(): String {
        return newsImg
    }
    fun setnewsImg(newsImg: String){
        this.newsImg=newsImg

    }
    fun getuserImage(): String {
        return userImage
    }
    fun setuserImage(userImage: String){
        this.userImage=userImage

    } @JvmName("getContent1")
    fun getContent(): String{
        return content
    }
    @JvmName("setContent1")
    fun setContent(content: String){
        this.content=content

    }
    @JvmName("getBgColor1")
    fun getBgColor(): String {
        return bgColor
    }
    @JvmName("setBgColor1")
    fun setBgColor(bgColor: String){
        this.bgColor=bgColor

    }
    fun getdate(): String {
        return dateCreation
    }
    fun setdate(dateCreation: String){
        this.dateCreation=dateCreation

    } fun getviewType(): Int {
        return viewType
    }
    @JvmName("setViewType1")
    fun setViewType(viewType: Int){
        this.viewType=viewType

    }
    fun getvideoUrl(): String {
        return videoUrl
    }
    fun setvideoUrl(videoUrl: String){
        this.videoUrl=videoUrl

    }
    fun getisFav(): Boolean {
        return isfav
    }
    fun setisFav(isfav: Boolean){
        this.isfav=isfav

    }

    override fun toString(): String {
        return "NewsItem(id=$id, title=$title, username=$username, newsImg=$newsImg, userImage=$userImage, content=$content, bgColor=$bgColor, dateCreation=$dateCreation, viewType=$viewType, videoUrl=$videoUrl, isfav=$isfav)"
    }

}