package com.example.see_toggle

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var result : TextView
    lateinit var toggleButton : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        image = findViewById(R.id.imageView2)
        result = findViewById(R.id.textView)

//        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
//            if(isChecked){
//                image.visibility = View.INVISIBLE
//                result.text = "The image is invisible"
//            }else{
//                image.visibility = View.VISIBLE
//                result.text = "The image is Visible"
//            }
//        }
        //2 image toggle
        toggleButton.setOnCheckedChangeListener{compoundButton,isChecked->
            if(isChecked){
                image.setImageResource(R.drawable.img1)
            }
            else{
                image.setImageResource(R.drawable.img)
            }
        }
    }
}