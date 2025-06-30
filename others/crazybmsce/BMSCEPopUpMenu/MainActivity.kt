package com.example.bmscepopmenu

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.discipline_menu, popup.menu)

        popup.setOnMenuItemClickListener { item: MenuItem ->
            Toast.makeText(this, "Selected: ${item.title}", Toast.LENGTH_SHORT).show()
            true
        }

        popup.show()
    }
}
