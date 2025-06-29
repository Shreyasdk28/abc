package com.example.see_textimagetoggle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    private lateinit var donutImage: ImageView
    private lateinit var waffleImage: ImageView
    private lateinit var cupcakeImage: ImageView

    // Image resources
    private val donutImages = listOf(R.drawable.img, R.drawable.img_2)
    private val waffleImages = listOf(R.drawable.img_1, R.drawable.img_2)
    private val cupcakeImages = listOf(R.drawable.img, R.drawable.img_1)

    // To keep track of current image
    private var donutIndex = 0
    private var waffleIndex = 0
    private var cupcakeIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        donutImage = findViewById(R.id.imageView7)
        waffleImage = findViewById(R.id.imageView6)
        cupcakeImage = findViewById(R.id.imageView5)
    }

    fun donut(view: View) {
        // Cycle through donut images
        donutIndex = (donutIndex + 1) % donutImages.size
        donutImage.setImageResource(donutImages[donutIndex])
    }

    fun waffle(view: View) {
        // Cycle through waffle images
        waffleIndex = (waffleIndex + 1) % waffleImages.size
        waffleImage.setImageResource(waffleImages[waffleIndex])
    }

    fun cupcake(view: View) {
        // Cycle through cupcake images
        cupcakeIndex = (cupcakeIndex + 1) % cupcakeImages.size
        cupcakeImage.setImageResource(cupcakeImages[cupcakeIndex])
    }
    }
