package com.example.see_canvas

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitmap = Bitmap.createBitmap(700, 1000, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        // Draw rectangle
//        ShapeDrawable(RectShape()).apply {
//            setBounds(100, 100, 600, 400)
//            paint.color = Color.parseColor("#009944")
//            draw(canvas)
//        }
        ShapeDrawable(RectShape()).apply{
            setBounds(100,100,600,400)
            paint.color= Color.GREEN
            draw(canvas)
        }
        ShapeDrawable(RectShape()).apply {
            setBounds(10,20,30,40)
            paint.color= Color.LTGRAY
            draw(canvas)

        }
        // Draw oval
        ShapeDrawable(OvalShape()).apply {
            setBounds(100, 350, 600, 800)
            paint.color = Color.parseColor("#009191")
            draw(canvas)
        }

        findViewById<ImageView>(R.id.image).background =
            BitmapDrawable(resources, bitmap)
    }


}
