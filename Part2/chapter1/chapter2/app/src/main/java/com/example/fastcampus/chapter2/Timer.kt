package com.example.fastcampus.chapter2

import android.os.Looper
import java.time.Duration

class Timer(listener: OnTimerTickListener) {
    private var duration :Long = 0L
    private val handler = android.os.Handler(Looper.getMainLooper())
    private val runnable:Runnable = object :Runnable{
        override fun run() {
            duration += 40L
            handler.postDelayed(this,40L)
        }
    }

    fun start(){
        handler.postDelayed(runnable,40L)
    }
    fun stop(){
        handler.removeCallbacks(runnable)
        duration = 0L
    }


}

interface OnTimerTickListener{
    fun onTick(duration: Long)
}