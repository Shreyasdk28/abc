package com.example.toggleimageapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var toggleButton: ToggleButton
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        imageView = findViewById(R.id.imageView)

        // ✅ Set initial visibility based on toggle state
        imageView.visibility = if (toggleButton.isChecked) ImageView.GONE else ImageView.VISIBLE

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            imageView.visibility = if (isChecked) ImageView.GONE else ImageView.VISIBLE
        }
    }
}

