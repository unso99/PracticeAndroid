package com.example.fastcampus.chapter6

import android.media.AudioManager
import android.media.ToneGenerator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.core.view.setPadding
import com.example.fastcampus.chapter6.databinding.ActivityMainBinding
import com.example.fastcampus.chapter6.databinding.DialogCountdownSettingBinding
import java.util.Timer
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var countDownSecond = 5
    private var currentCountdownDeciSecond = countDownSecond * 10
    private var currentDeciSecond = 0
    private var timer: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.countdownTextView.setOnClickListener {
            showCountDownSettingDialog()
        }

        binding.startButton.setOnClickListener {
            start()
            binding.startButton.isVisible = false
            binding.stopButton.isVisible = false
            binding.puaseButton.isVisible = true
            binding.lapButton.isVisible = true
        }

        binding.stopButton.setOnClickListener {
            showAlertDialog()

        }
        binding.puaseButton.setOnClickListener {
            pause()
            binding.startButton.isVisible = true
            binding.stopButton.isVisible = true
            binding.puaseButton.isVisible = false
            binding.lapButton.isVisible = false
        }
        binding.lapButton.setOnClickListener {
            lap()
        }
        initCountDownView()
    }

    private fun initCountDownView() {
        binding.countdownTextView.text = String.format("%02d", countDownSecond)

        binding.countDownProgressBar.progress = 100
    }

    private fun lap() {
        if(currentDeciSecond == 0) return
        val container = binding.lapContainerLinearLayout
        val lapTextView = TextView(this).apply {
            textSize = 20f
            gravity = Gravity.CENTER
            val minutes = currentDeciSecond.div(10) / 60
            val seconds = currentDeciSecond.div(10) % 60
            val deciSeconds = currentDeciSecond % 10
            text = container.childCount.inc().toString()+ ": "+ String.format(
                "%02d:%02d %01d",
                minutes,
                seconds,
                deciSeconds
            )
            setPadding(30)
        }.let { lapTextView ->
            container.addView(lapTextView, 0)
        }
    }

    private fun pause() {
        timer?.cancel()
        timer = null

    }

    private fun stop() {
        binding.startButton.isVisible = true
        binding.stopButton.isVisible = true
        binding.puaseButton.isVisible = false
        binding.lapButton.isVisible = false

        currentDeciSecond = 0
        binding.timeTextView.text = "00:00"
        binding.tickTextView.text = "0"

        binding.countDownGroup.isVisible = true
        initCountDownView()
        binding.lapContainerLinearLayout.removeAllViews()

    }

    private fun start() {
        timer = timer(initialDelay = 0, period = 100) {
            if (currentCountdownDeciSecond == 0) {
                currentDeciSecond += 1
                val minutes = currentDeciSecond.div(10) / 60
                val seconds = currentDeciSecond.div(10) % 60
                val deciSeconds = currentDeciSecond % 10
                runOnUiThread {
                    binding.timeTextView.text = String.format("%02d:%02d", minutes, seconds)
                    binding.tickTextView.text = deciSeconds.toString()

                    binding.countDownGroup.isVisible = false
                }
            } else {
                currentCountdownDeciSecond -= 1
                val seconds = currentCountdownDeciSecond / 10
                val progress = (currentCountdownDeciSecond / (countDownSecond * 10f)) * 100
                binding.root.post {
                    binding.countdownTextView.text = String.format("%02d", seconds)
                    binding.countDownProgressBar.progress = progress.toInt()
                }
            }
            if(currentDeciSecond == 0 && currentCountdownDeciSecond < 31 && currentCountdownDeciSecond %10 == 0){
                val toneType = if(currentCountdownDeciSecond ==0) ToneGenerator.TONE_CDMA_HIGH_L else ToneGenerator.TONE_CDMA_ABBR_ALERT
                ToneGenerator(AudioManager.STREAM_ALARM,ToneGenerator.MAX_VOLUME)
                    .startTone(toneType,100)
            }


        }

    }

    private fun showCountDownSettingDialog() {
        AlertDialog.Builder(this).apply {
            val dialogBinding = DialogCountdownSettingBinding.inflate(layoutInflater)
            with(dialogBinding.countdownSecondPicker) {
                maxValue = 20
                minValue = 0
                value = countDownSecond
            }
            setTitle("카운트다운 설정")
            setView(dialogBinding.root)
            setPositiveButton("확인") { dialog, id ->
                countDownSecond = dialogBinding.countdownSecondPicker.value
                currentCountdownDeciSecond = countDownSecond * 10
                binding.countdownTextView.text = String.format("%02d", countDownSecond)
            }
            setNegativeButton("취소", null)
        }.show()
    }

    private fun showAlertDialog() {
        AlertDialog.Builder(this).apply {
            setMessage("종료하시겠습니까?")
            setPositiveButton("네") { dialog, id ->
                stop()
            }
            setNegativeButton("아니오", null)
        }.show()
    }
}