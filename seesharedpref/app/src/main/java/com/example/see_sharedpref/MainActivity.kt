package com.example.see_sharedpref

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.ed1)
        val password = findViewById<EditText>(R.id.ed2)
        val save = findViewById<Button>(R.id.b1)
        val load = findViewById<Button>(R.id.b2)
        val clear = findViewById<Button>(R.id.b3)
        val del = findViewById<Button>(R.id.b4)

        val sharedpref=getSharedPreferences("abc",Context.MODE_PRIVATE)
        val edit=sharedpref.edit()


        save.setOnClickListener {
            edit.putString("uname",name.text.toString())
            edit.putString("pass",password.text.toString())
            edit.commit()
            Toast.makeText(this,"save over",Toast.LENGTH_SHORT).show()
        }
        load.setOnClickListener {
            val n=sharedpref.getString("uname","default")
            val p=sharedpref.getString("pass","defualt")
            Toast.makeText(this,n+" "+p,Toast.LENGTH_SHORT).show()
        }
        clear.setOnClickListener {
            name.text.clear()
            password.text.clear()
            Toast.makeText(this,"fields clear",Toast.LENGTH_SHORT).show()
        }
        del.setOnClickListener {
            edit.clear()
            edit.commit()
            Toast.makeText(this, "cleared", Toast.LENGTH_SHORT).show()
        }
    }
}