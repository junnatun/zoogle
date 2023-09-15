package com.junnatun.zoogleapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junnatun.zoogleapp.R
import com.junnatun.zoogleapp.databinding.ActivityMainBinding
import com.junnatun.zoogleapp.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up_page)
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        val name = intent.getStringExtra("name")
//        binding.text.text=name

        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpPage::class.java)
//            intent.putExtra("name", "")
            startActivity(intent)
        }

        binding.btnMasuk.setOnClickListener {
            startActivity(Intent(this,LoginPage::class.java))
        }
    }
}