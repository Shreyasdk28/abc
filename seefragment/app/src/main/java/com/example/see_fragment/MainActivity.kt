package com.example.see_fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.example.see_fragment.databinding.ActivityMainBinding
import com.example.see_fragment.frag1
import com.example.see_fragment.frag2

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button1.setOnClickListener {
            goToFragment(frag1())
        }
        binding.button2.setOnClickListener {
            goToFragment(frag2())
        }
    }

    private fun goToFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()

    }
}
//in build gradle
//viewBinding{
//    enable true
//}
