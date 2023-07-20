package com.example.fastcampus.chapter5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("news/SectionRssFeed.do?sectionId=01&plink=RSSREADER")
    fun mainFeed(): Call<NewsRss>

    @GET("news/SectionRssFeed.do?sectionId=02&plink=RSSREADER")
    fun economyFeed() : Call<NewsRss>

    @GET("news/SectionRssFeed.do?sectionId=03&plink=RSSREADER")
    fun socialFeed() : Call<NewsRss>

    @GET("news/SectionRssFeed.do?sectionId=07&plink=RSSREADER")
    fun lifeStyleFeed() : Call<NewsRss>

    @GET("news/SectionRssFeed.do?sectionId=14&plink=RSSREADER")
    fun talentFeed() : Call<NewsRss>

    @GET("news/SectionRssFeed.do?sectionId=09&plink=RSSREADER")
    fun sportFeed() : Call<NewsRss>

    @GET("rss/search?&hl=ko&gl=KR&ceid=KR%3Ako")
    fun search(@Query("q") query:String) : Call<NewsRss>
}