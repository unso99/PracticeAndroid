package com.example.fastcampus.chapter5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.fastcampus.chapter5.databinding.ActivityMainBinding
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import org.jsoup.Jsoup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var newsAdapter: NewsAdapter
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://news.sbs.co.kr/")
        .addConverterFactory(
            TikXmlConverterFactory.create(
                TikXml.Builder()
                    .exceptionOnUnreadXml(false)
                    .build()
            )
        ).build()
    private val retrofit2 = Retrofit.Builder()
        .baseUrl("https://news.google.com/")
        .addConverterFactory(
            TikXmlConverterFactory.create(
                TikXml.Builder()
                    .exceptionOnUnreadXml(false)
                    .build()
            )
        ).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        newsAdapter = NewsAdapter { url ->
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url", url)
            startActivity(intent)
        }
        val newsService = retrofit.create(NewsService::class.java)
        val googleService = retrofit2.create(NewsService::class.java)

        binding.newsRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = newsAdapter

        }



        binding.politicsChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.politicsChip.isChecked = true

            //todo api호출, list변경
            newsService.mainFeed().submitList()
        }

        binding.economyChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.economyChip.isChecked = true
            newsService.economyFeed().submitList()

        }

        binding.lifeStyleChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.lifeStyleChip.isChecked = true
            newsService.lifeStyleFeed().submitList()
        }

        binding.socialChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.socialChip.isChecked = true
            newsService.socialFeed().submitList()
        }

        binding.sportChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.sportChip.isChecked = true
            newsService.sportFeed().submitList()
        }

        binding.talentChip.setOnClickListener {
            binding.chipGroup.clearCheck()
            binding.talentChip.isChecked = true
            newsService.talentFeed().submitList()
        }


        binding.searchEditText.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                binding.chipGroup.clearCheck()
                binding.searchEditText.clearFocus()
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
                googleService.search(binding.searchEditText.text.toString()).submitList()

                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }

        newsService.mainFeed().submitList()

    }

    private fun Call<NewsRss>.submitList() {
        enqueue(object : Callback<NewsRss> {
            override fun onResponse(call: Call<NewsRss>, response: Response<NewsRss>) {
                Log.e("MainActivity", "${response.body()?.channel?.items}")
                val list = response.body()?.channel?.items.orEmpty().transform()
                newsAdapter.submitList(list)
                binding.notFoundView.isVisible = list.isEmpty()
                list.forEachIndexed { index, news ->
                    Thread {
                        val jsoup = Jsoup.connect(news.link).get()
                        val elements = jsoup.select("meta[property^=og:]")
                        val ogImageNode = elements.find { node ->
                            node.attr("property") == "og:image"
                        }
                        news.imageUrl = ogImageNode?.attr("content")
                        Log.e("MainActivity", "imageUrl ${news.imageUrl}")

                        runOnUiThread {
                            newsAdapter.notifyItemChanged(index)
                        }

                    }.start()

                }

            }

            override fun onFailure(call: Call<NewsRss>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }
}