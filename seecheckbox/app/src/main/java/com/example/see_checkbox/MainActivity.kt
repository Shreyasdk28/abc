package com.example.see_checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var a:CheckBox
    lateinit var b:CheckBox
    lateinit var m:CheckBox
    lateinit var but:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        a=findViewById(R.id.c1)
        b=findViewById<CheckBox>(R.id.c2)
        m=findViewById<CheckBox>(R.id.c3)
        but=findViewById(R.id.button)
        but.setOnClickListener {
            var total:Int=0
            val result=StringBuilder()
            result.append("selected items")
            if (a.isChecked){
                result.append("apple 200rs")
                total=total+200
            }
            if (b.isChecked){
                result.append("banana 50rs")
                total=total+50
            }
            if (m.isChecked){
                result.append("mango 100rs")
                total=total+100
            }
            result.append("total amount"+total)
            Toast.makeText(applicationContext,result.toString(),Toast.LENGTH_SHORT).show()

        }

    }
}