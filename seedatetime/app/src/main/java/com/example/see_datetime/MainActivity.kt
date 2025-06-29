package com.example.see_datetime

import android.annotation.SuppressLint
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import java.util.Date

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dp=findViewById<DatePicker>(R.id.dp)
        dp.setOnDateChangedListener{obj,i,i2,i3-> val i2=i2+1
        Toast.makeText(this,"date is $i3/$i2/$i",Toast.LENGTH_SHORT).show()}

        val timer=findViewById<TimePicker>(R.id.time)
//        timer.setOnTimeChangedListener{_,hour,minute->
//            var am_pm=""
//            val hour=if(hour<10) "0"+hour else hour
//            val min=if(minute<10) "0"+minute else minute
//            val msg="time is $hour:$min $am_pm"
//            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show();
//
//        }
        timer.setOnTimeChangedListener {_,hr,minute->
            var hr=hr
            var am_pm=""
            when{hr==0->{hr+=12
                am_pm="AM"}
                hr==12-> am_pm="PM"
                hr>12->{hr-=12
                    am_pm="PM"}
                else->am_pm="AM"}
            val hr1=if(hr<10) "0"+hr else hr
            val minute1=if(minute<10) "0"+minute else minute
            val msg="time is $hr1:$minute1 $am_pm"
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
}
}
}

