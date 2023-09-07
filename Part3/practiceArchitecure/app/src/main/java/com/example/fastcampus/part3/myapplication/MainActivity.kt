package com.example.fastcampus.part3.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fastcampus.part3.myapplication.databinding.ActivityMainBinding
import com.example.fastcampus.part3.myapplication.mvc.controller.MvcActivity
import com.example.fastcampus.part3.myapplication.mvp.MvpActivity
import com.example.fastcampus.part3.myapplication.mvvm.MvvmActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.view = this
    }

    fun openMvc() {
        startActivity(Intent(this, MvcActivity::class.java))
    }

    fun openMvp(){
        startActivity(Intent(this,MvpActivity::class.java))
    }

    fun openMvvm(){
        startActivity(Intent(this,MvvmActivity::class.java))
    }
}