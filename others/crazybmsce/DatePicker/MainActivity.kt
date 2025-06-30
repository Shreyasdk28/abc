package com.example.datepicker

import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val button = findViewById<Button>(R.id.showDateBtn)
        val textView = findViewById<TextView>(R.id.dateTextView)

        button.setOnClickListener {
            val date = "${datePicker.dayOfMonth}/${datePicker.month + 1}/${datePicker.year}"
            textView.text = "Selected Date: $date"
        }
    }
}
