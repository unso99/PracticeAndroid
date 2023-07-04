package com.example.fastcampus.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.google.gson.Gson
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.serverHostEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val informationTextView = findViewById<TextView>(R.id.inforamtionTextView)
        val client = OkHttpClient()
        var serverHost = ""

        editText.addTextChangedListener {
            serverHost = it.toString()
        }

        confirmButton.setOnClickListener{
            val request: Request = Request.Builder()
                .url("http://$serverHost:8080")
                .build()

            val callback = object : Callback{
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread {
                        Toast.makeText(this@MainActivity,"수신에 실패했습니다",Toast.LENGTH_SHORT).show()
                    }

                    Log.e("Client",e.toString())
                }

                override fun onResponse(call: Call, response: Response) {
                    if(response.isSuccessful){
                        val result = response.body?.string()

                        val message = Gson().fromJson(result,Message::class.java)
                        runOnUiThread {
                            informationTextView.isVisible = true
                            informationTextView.text = message.message

                            editText.isVisible = false
                            confirmButton.isVisible = false
                        }

                    }else {
                        runOnUiThread {
                            Toast.makeText(this@MainActivity,"수신에 실패했습니다",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
            client.newCall(request).enqueue(callback)
        }
    }
}