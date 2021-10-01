package com.example.horizontalscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val resultText: TextView by lazy {
        findViewById(R.id.resultText)
    }

//    private val horizontalScrollViewUI: ScrollView by lazy{
//        findViewById(R.id.horizontalScrollViewUI)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText



//        val padding: Int = ScreenUtils
    }
}