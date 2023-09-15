package com.junnatun.zoogleapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junnatun.zoogleapp.MainActivity
import com.junnatun.zoogleapp.R
import com.junnatun.zoogleapp.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {
    private lateinit var binding:ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_login_page)
        //val button= findViewById<Button>(R.id.btn_masuk)


//        binding.button3.setOnClickListener{
//            startActivity(Intent(this,Splashscreen::class.java))
//        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
//            intent.putExtra("name", "junna")
            startActivity(intent)
        }

        binding.btnDaftar.setOnClickListener {
            startActivity(Intent(this,SignUpPage::class.java))
        }
    }
}