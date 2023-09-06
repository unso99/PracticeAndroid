package com.example.fastcampus.part3.myapplication.mvp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.fastcampus.part3.myapplication.databinding.ActivityMvpBinding
import com.example.fastcampus.part3.myapplication.mvp.model.ImageCountModel
import com.example.fastcampus.part3.myapplication.mvp.repository.ImageRepositoryImpl

class MvpActivity: AppCompatActivity(),MvpContractor.View {
    private lateinit var binding : ActivityMvpBinding

    private lateinit var presenter: MvpContractor.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.view = this

        presenter = MvpPresenter(ImageCountModel(),ImageRepositoryImpl())
        presenter.attachView(this)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }

    override fun showImage(url: String, color: String) {
        with(binding){
            imageView.run {
                setBackgroundColor(Color.parseColor(color))
                load(url){
                    crossfade(300)
                }
            }
        }
    }

    override fun showImageCountText(count: Int) {
        binding.imageCountTextView.text = "불러온 이미지 수 : $count"
    }

    fun loadImage(){
        presenter.loadRandomImage()
    }


}