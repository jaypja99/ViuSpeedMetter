package com.example.viuspeedmetter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val left_gauge=findViewById<View>(R.id.left_gauge)
        val left_teco_gauge=findViewById<View>(R.id.left_teco_black)
        val right_gauge=findViewById<View>(R.id.right_blue_gauge)
        val right_teco_gauge=findViewById<View>(R.id.right_gauge)

        val imgDots=findViewById<View>(R.id.imgDots)

        left_gauge.animate().translationY(-415f).duration=10000
        left_teco_gauge.animate().translationY(-415f).duration=10000

        right_gauge.animate().translationY(-415f).duration=10000
        right_teco_gauge.animate().translationY(-415f).duration=10000

        imgDots.animate().scaleX(1.1f).scaleY(1.1f).duration=7000
    }
}