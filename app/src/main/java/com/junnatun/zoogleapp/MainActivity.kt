package com.junnatun.zoogleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junnatun.zoogleapp.databinding.ActivityMainBinding
import com.junnatun.zoogleapp.databinding.ActivitySplashscreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.text.text=name
    }
}