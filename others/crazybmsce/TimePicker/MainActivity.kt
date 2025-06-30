package com.example.timepicker

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        timePicker.setIs24HourView(true)
        val button = findViewById<Button>(R.id.showTimeBtn)
        val textView = findViewById<TextView>(R.id.timeTextView)

        button.setOnClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            textView.text = "Selected Time: $hour:$minute"
        }
    }
}
