package com.example.see_customcheck

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {lateinit var star: CheckBox
    lateinit var emoji: CheckBox
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            var emoji=findViewById<CheckBox>(R.id.checkBox)
            var star=findViewById<CheckBox>(R.id.checkBox2)
            val str = StringBuilder()
            if (emoji.isChecked)
                str.append(emoji.text)
            if (star.isChecked) {
                if (str.isNotEmpty()) str.append(", ")
                str.append(star.text)
            }
            Toast.makeText(this, str.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}