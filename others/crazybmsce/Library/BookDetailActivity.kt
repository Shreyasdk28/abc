package com.example.library

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        val bookTitle = intent.getStringExtra("book_title")
        val bookTitleTextView: TextView = findViewById(R.id.bookTitleTextView)
        bookTitleTextView.text = bookTitle
    }
}
