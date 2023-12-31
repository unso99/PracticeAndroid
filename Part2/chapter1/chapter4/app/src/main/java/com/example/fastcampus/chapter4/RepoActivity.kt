package com.example.fastcampus.chapter4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fastcampus.chapter4.adapter.RepoAdapter
import com.example.fastcampus.chapter4.databinding.ActivityRepoBinding
import com.example.fastcampus.chapter4.model.Repo
import com.example.fastcampus.chapter4.network.GithubService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepoActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRepoBinding
    private lateinit var repoAdapter: RepoAdapter
    private var page = 0
    private var hasMore = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRepoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra("username") ?: return

        binding.usernameTextView.text = userName

        repoAdapter = RepoAdapter{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it.htmlUrl))
            startActivity(intent)
        }

        val linearLayoutManager = LinearLayoutManager(this@RepoActivity)

        binding.repoRecyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = repoAdapter
        }

        binding.repoRecyclerView.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val totalCount = linearLayoutManager.itemCount
                val lastVisiblePosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()

                if(lastVisiblePosition >= (totalCount-1) && hasMore){
                    page+=1
                    listRepo(userName,page)
                }

            }
        })

        listRepo(userName,0)
    }

    private fun listRepo(userName:String,page:Int){
        val githubService = ApiClient.retrofit.create(GithubService::class.java)
        githubService.listRepos(userName,page).enqueue(object : Callback<List<Repo>> {
            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
                Log.e("MainActivity", "List Repo : ${response.body().toString()}")
                hasMore = response.body()?.count() == 30
                repoAdapter.submitList(repoAdapter.currentList + response.body().orEmpty())
            }

            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}