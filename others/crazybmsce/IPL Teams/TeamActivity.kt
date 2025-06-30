package com.example.iplteams

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

        val teamName = intent.getStringExtra("team_name")
        findViewById<TextView>(R.id.teamNameTextView).text = "You selected: $teamName"
    }
}
