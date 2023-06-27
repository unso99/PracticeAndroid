package com.example.fastcampus.chapter1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val mainActivity: MainActivity) :
    FragmentStateAdapter(mainActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                return WebViewFragment(position,"https://comic.naver.com/webtoon/detail?titleId=783053&no=85").apply {
                    listener = mainActivity
                }
            }

            1 -> {
                return WebViewFragment(position,"https://comic.naver.com/webtoon/detail?titleId=811721&no=6").apply {
                    listener = mainActivity
                }
            }

            else -> {
                return WebViewFragment(position,"https://comic.naver.com/webtoon/detail?titleId=776601&no=72").apply {
                    listener = mainActivity
                }
            }
        }
    }
}