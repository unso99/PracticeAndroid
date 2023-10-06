package com.example.fastcampus.part3.shop

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import coil.load
import java.text.NumberFormat
import java.util.Locale

@BindingAdapter("visible")
fun View.setVisible(isShow: Boolean) {
    isVisible = isShow
}

@BindingAdapter("imageUrl")
fun ImageView.setImage(imageUrl: String?) {
    load(imageUrl) {
        crossfade(300)
    }
}

@BindingAdapter("moneyText")
fun TextView.setMoenyText(money: Long?) {
    text = NumberFormat.getInstance(Locale.KOREA).format(money ?: 0) + "원"
}