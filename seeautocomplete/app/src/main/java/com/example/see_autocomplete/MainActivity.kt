package com.example.see_autocomplete

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val fruits = arrayOf(
        "apple", "banana", "cherry", "date", "grape", "kiwi",
        "lemon", "mango", "dragonfruit", "passion fruit", "mandarin", "papaya"
    )

    @SuppressLint("MissingInflatedId")
    lateinit var autoTextView: AutoCompleteTextView
    lateinit var adapter: ArrayAdapter<String>
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        autoTextView = findViewById(R.id.auto)
        btn = findViewById(R.id.button)

        adapter = ArrayAdapter(this, android.R.layout.select_dialog_item, fruits)
        autoTextView.threshold = 1
        autoTextView.setAdapter(adapter)

        btn.setOnClickListener {
            val selected = autoTextView.text.toString()
                Toast.makeText(this, "You selected: $selected", Toast.LENGTH_SHORT).show()

        }
    }
}
