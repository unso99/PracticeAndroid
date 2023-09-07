package com.example.fastcampus.part3.myapplication.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fastcampus.part3.myapplication.mvvm.model.Image
import com.example.fastcampus.part3.myapplication.mvvm.repository.ImageRepository
import io.reactivex.disposables.CompositeDisposable

class MvvmViewModel(private val imageRepository: ImageRepository) : ViewModel() {

    //라이브 데이터 추가
    private val _countLiveData = MutableLiveData<String>()
    val countLiveData: LiveData<String> by lazy { _countLiveData }

    private val _imageLiveData = MutableLiveData<Image>()
    val imageLiveData: LiveData<Image> by lazy { _imageLiveData }

    //rx를 사용하기위해
    private var disposable: CompositeDisposable? = CompositeDisposable()

    //카운트
    private var count = 0

    fun loadImage() {
        disposable?.add(imageRepository.getRandomImage()
            .doOnSuccess {
                count++
            }
            .subscribe { item ->
                _countLiveData.value = "불러온 이미지 수 : $count"
                _imageLiveData.value = item
            })
    }

    override fun onCleared() {
        super.onCleared()
        disposable = null
    }

    //acitivity에서 viewmodel을 호출할때파라미터를 가져오기 위함
    class MvvmViewModelFactory(private val imageRepository: ImageRepository) : ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MvvmViewModel(imageRepository) as T
        }
    }
}