package com.example.see_alert

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var butn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        butn=findViewById(R.id.button)
        butn.setOnClickListener { showalert() }
    }
    fun showalert(){
        var btn=AlertDialog.Builder(this@MainActivity)
        btn.setTitle("what you want to do")
            .setIcon(R.drawable.ic_baseline_warning_24)
            .setPositiveButton("yes",DialogInterface.OnClickListener{
                dialogInterface, i ->
                butn.text="alerting"
            })
            .setNegativeButton("no",DialogInterface.OnClickListener{
                    dialogInterface, i ->
                dialogInterface.cancel()
            })
            .setNeutralButton("later"){
                    DialogInterface,i->
                    DialogInterface.dismiss()
            }
        btn.create().show()
    }
}