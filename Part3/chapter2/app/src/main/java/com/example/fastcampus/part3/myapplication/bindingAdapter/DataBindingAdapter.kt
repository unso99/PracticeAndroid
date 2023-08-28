package com.example.fastcampus.part3.myapplication.bindingAdapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.fastcampus.part3.myapplication.R

@BindingAdapter(value = ["code_text", "code_index"])
fun ImageView.setPin(codeText: CharSequence?, index: Int) {
    if (codeText != null){
        if(codeText.length > index ){
            setImageResource(R.drawable.baseline_black_circle_24)
        }else {
            setImageResource(R.drawable.baseline_gray_circle_24)
        }
    }
}