package com.example.see_radiowithintent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val message = intent.getStringExtra("MESSAGE") ?: "No message received"
        tvMessage.text = message

    }
}
