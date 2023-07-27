package com.example.fastcampus.chapter8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fastcampus.chapter8.databinding.ActivityRestaurantsWebViewBinding

class RestaurantsWebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantsWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantsWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = intent.getStringExtra("url") ?: ""
        Log.e("webView",url)

        binding.webView.loadUrl(url)
    }
}