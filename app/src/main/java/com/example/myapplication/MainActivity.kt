package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var counter : TextView
    private  lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.counter)
        btn = findViewById(R.id.btn)

        var timesClicked = 0

        btn.setOnClickListener{
            timesClicked += 1
            counter.text = timesClicked.toString()
        }
    }
}