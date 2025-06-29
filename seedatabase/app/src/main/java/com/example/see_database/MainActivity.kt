package com.example.see_database

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fname: EditText
    private lateinit var lname: EditText
    private lateinit var listView: TextView
    private lateinit var db: dbcontroller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fname = findViewById(R.id.fname)
        lname = findViewById(R.id.lname)
        listView = findViewById(R.id.textView)
        db = dbcontroller(this)
    }

    fun btn_click(v: View) {
        when (v.id) {
            R.id.btnadd -> db.insert(fname.text.toString(), lname.text.toString())
            R.id.btndel -> db.delete(fname.text.toString())
            R.id.btnupd -> showUpdateDialog()
            R.id.btnlis -> db.list(listView)
        }
    }

    private fun showUpdateDialog() {
        val input = EditText(this)
        AlertDialog.Builder(this)
            .setTitle("Enter New First Name")
            .setView(input)
            .setPositiveButton("OK") { _, _ ->
                db.update(fname.text.toString(), input.text.toString())
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
}