package com.junnatun.zoogleapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.junnatun.zoogleapp.MainActivity
import com.junnatun.zoogleapp.R
import com.junnatun.zoogleapp.databinding.ActivityLoginPageBinding
import com.junnatun.zoogleapp.databinding.ActivitySplashscreenBinding

class Splashscreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
//        binding=ActivitySplashscreenBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.button2.setOnClickListener{
//            startActivity(Intent(this,MainActivity::class.java))
//            finish()
//        }
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginPage::class.java))
            finish()
        }, 3000)
    }
}
