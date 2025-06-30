package com.example.see_radiowithintent

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var btnLaunch: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup = findViewById(R.id.radioGroupIntentType)
        btnLaunch = findViewById(R.id.btnLaunch)

        btnLaunch.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val radioButton = findViewById<RadioButton>(selectedId)

            when (radioButton.id) {
                R.id.radioExplicit -> {
                    // Explicit Intent (launch SecondActivity)
                    val intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("MESSAGE", "Hello from Explicit Intent!")
                    startActivity(intent)
                }
                R.id.radioImplicit -> {
                    // Implicit Intent (open website)
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://www.android.com")
                    try {
                        startActivity(intent)
                    } catch (e: Exception) {
                        Toast.makeText(this, "No app can handle this request", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}