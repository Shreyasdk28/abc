package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a=findViewById<EditText>(R.id.textView3)
        var b=findViewById<EditText>(R.id.textView)
        var add=findViewById<Button>(R.id.button)
        var sub=findViewById<Button>(R.id.button2)
        var mul=findViewById<Button>(R.id.button3)
        var div=findViewById<Button>(R.id.button4)
        var conc=findViewById<Button>(R.id.button5)
        var res=findViewById<TextView>(R.id.textView4)
        add.setOnClickListener {
            res.text="result"+(a.text.toString().toInt()+b.text.toString().toInt()).toString()
        }
        sub.setOnClickListener {
            res.text="result"+(a.text.toString().toInt()-b.text.toString().toInt()).toString()
        }
        mul.setOnClickListener {
            res.text="result"+(a.text.toString().toInt()*b.text.toString().toInt()).toString()
        }
        div.setOnClickListener {
            res.text="result"+(a.text.toString().toInt()/b.text.toString().toInt()).toString()
        }
    }
}