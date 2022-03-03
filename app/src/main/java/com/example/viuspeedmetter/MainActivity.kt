package com.example.viuspeedmetter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val right_gauge=findViewById<View>(R.id.right_gauge)
        val left_gauge=findViewById<View>(R.id.left_gauge)

        left_gauge.animate().translationY(-1300f).duration=30000
    }
}