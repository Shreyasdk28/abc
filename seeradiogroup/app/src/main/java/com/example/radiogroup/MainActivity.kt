package com.example.radiogroup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var radioGroup: RadioGroup?=null
    lateinit var radioButton: RadioButton
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        btn=findViewById<Button>(R.id.button)
        radioGroup=findViewById(R.id.rg)
        btn.setOnClickListener {
            val selected:Int=radioGroup!!.checkedRadioButtonId
            radioButton=findViewById(selected)
            Toast.makeText(this,radioButton.text,Toast.LENGTH_SHORT).show()

        }
    }
}