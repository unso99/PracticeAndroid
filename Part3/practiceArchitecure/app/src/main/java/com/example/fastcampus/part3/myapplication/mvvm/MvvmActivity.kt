package com.example.fastcampus.part3.myapplication.mvvm

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.fastcampus.part3.myapplication.databinding.ActivityMvvmBinding
import com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepositoryImpl

class MvvmActivity:AppCompatActivity() {
    private lateinit var binding : ActivityMvvmBinding

    private val viewModel : MvvmViewModel by viewModels {
        MvvmViewModel.MvvmViewModelFactory(ImageRepositoryImpl())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.view = this
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }

    fun loadImage(){
        viewModel.loadImage()
    }
}