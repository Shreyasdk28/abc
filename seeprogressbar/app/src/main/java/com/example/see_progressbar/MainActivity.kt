package com.example.see_progressbar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        progressBar = findViewById<ProgressBar>(R.id.progressBar) as ProgressBar
        txtView = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)// handling click on button
        btn.setOnClickListener {
            progressBar!!.visibility = View.VISIBLE
            i = progressBar!!.progress
            Thread(Runnable {
                while (i < 100) {
                    i += 1
                    handler.post(Runnable {
                        progressBar!!.progress = i
                        txtView!!.text = i.toString() + "/" + progressBar!!.max
                    })
                    try {
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                progressBar!!.visibility = View.INVISIBLE
            }).start()
        }
    }
}