package com.example.incrementing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = 0
        var incBtn : Button = findViewById(R.id.increment_btn)
        var incTv : TextView = findViewById(R.id.increment_tv)
        incBtn.setOnClickListener{
            number++
            incTv.text = number.toString()
        }

    }
}