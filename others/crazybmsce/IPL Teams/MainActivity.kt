package com.example.iplteams

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val teams = arrayOf("RCB", "MI", "CSK", "KKR", "GT", "RR","PBKS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, teams)
        spinner.adapter = adapter

        findViewById<Button>(R.id.selectButton).setOnClickListener {
            val selectedTeam = spinner.selectedItem.toString()
            val intent = Intent(this, TeamActivity::class.java)
            intent.putExtra("team_name", selectedTeam)
            startActivity(intent)
        }
    }
}
