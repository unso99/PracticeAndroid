package com.example.fastcampus.chapter2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class WaveformView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val amplList = mutableListOf<Float>()
    private val rectList = mutableListOf<RectF>()
    private val rectWidth = 15f
    private var tick = 0
    private val redPaint = Paint().apply {
        color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        for (rectF in rectList) {
            canvas?.drawRect(rectF, redPaint)
        }
    }

    fun addAmplitude(maxAmplitude: Float) {
        val amplitude = (maxAmplitude / Short.MAX_VALUE) * this.height * 0.8f
        amplList.add(amplitude)
        rectList.clear()

        val maxRect = this.width / rectWidth

        val amps = amplList.takeLast(maxRect.toInt())

        for ((i, amp) in amps.withIndex()) {
            val rectF = RectF()
            rectF.top = (this.height / 2) - amp/2 -2f
            rectF.bottom = amp + rectF.top + 2f
            rectF.left = i * rectWidth
            rectF.right = rectF.left + rectWidth - 5f

            rectList.add(rectF)
        }

        invalidate()
    }

    fun replayAmplitude(duration: Int) {
        rectList.clear()

        val maxRect = (this.width / rectWidth).toInt()
        val amps = amplList.take(tick).takeLast(maxRect)

        for ((i, amp) in amps.withIndex()) {
            val rectF = RectF()
            rectF.top = (this.height /2) - amp/2 -2f
            rectF.bottom = rectF.top - amp +2f
            rectF.left = i * rectWidth
            rectF.right = rectF.left + rectWidth - 5f

            rectList.add(rectF)
        }
        tick++
        invalidate()
    }

    fun clearData(){
        amplList.clear()
    }

    fun clearWave(){
        rectList.clear()
        tick = 0
        invalidate()
    }
}