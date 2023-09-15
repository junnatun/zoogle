package com.junnatun.zoogleapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junnatun.zoogleapp.R
import com.junnatun.zoogleapp.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home_page)
        binding=ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}