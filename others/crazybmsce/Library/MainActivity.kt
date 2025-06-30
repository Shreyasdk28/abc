package com.example.library

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val books = listOf("The Great Gatsby", "1984", "To Kill a Mockingbird", "Pride and Prejudice")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.androidmanifest)

        val bookListView: ListView = findViewById(R.id.bookListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, books)
        bookListView.adapter = adapter

        bookListView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, BookDetailActivity::class.java)
            intent.putExtra("book_title", books[position])
            startActivity(intent)
        }
    }
}
