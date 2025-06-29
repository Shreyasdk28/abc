package com.example.see_customtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.buttonShowToast)
        b1.setOnClickListener {
            val ctoastlayout =
                layoutInflater.inflate(R.layout.second,findViewById(R.id.customcontainer))
            val customToast = Toast(this)
            customToast.view = ctoastlayout
            customToast.setGravity(Gravity.NO_GRAVITY,0,0)
            customToast.duration = Toast.LENGTH_LONG
            customToast.show()
        }

    }
}