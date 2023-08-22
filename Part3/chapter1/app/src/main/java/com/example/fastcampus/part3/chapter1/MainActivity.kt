package com.example.fastcampus.part3.chapter1

import android.graphics.PointF
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.util.SizeF
import android.view.View
import androidx.core.view.isVisible
import com.example.fastcampus.part3.chapter1.databinding.ActivityMainBinding
import com.example.fastcampus.part3.face_recognition.Camera
import com.example.fastcampus.part3.face_recognition.recognition.FaceAnalyzerListener

class MainActivity : AppCompatActivity(), FaceAnalyzerListener {
    private lateinit var binding : ActivityMainBinding
    private val camera = Camera(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setProgressText("시작하기를 눌러주세요.")
        camera.initCamera(binding.cameraLayout,this@MainActivity)

        binding.startDetectButton.setOnClickListener {
            it.visibility = View.GONE
            binding.faceOverlayView.reset()
            camera.startFaceDetect()
            setProgressText("얼굴을 보여주세요.")
        }




    }

    override fun detect() {

    }

    override fun stopDetect() {
        camera.stopFaceDetect()
        reset()
    }

    override fun notDetect() {
        binding.faceOverlayView.reset()
    }

    override fun detectProgress(progress: Float, message: String) {
        setProgressText(message)
        binding.faceOverlayView.setProgress(progress)
    }

    override fun faceSize(rectF: RectF, sizeF: SizeF, pointF: PointF) {
        binding.faceOverlayView.setSize(rectF, sizeF, pointF)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        camera.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun reset(){
        binding.startDetectButton.isVisible = true
    }

    private fun setProgressText(text:String){
        //progressTextView의 text가 바뀔때마다 애니메이션을 처리해주는 코드
        TransitionManager.beginDelayedTransition(binding.root)
        binding.progressTextView.text = text
    }
}