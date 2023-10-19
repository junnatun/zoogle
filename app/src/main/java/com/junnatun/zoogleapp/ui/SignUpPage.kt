package com.junnatun.zoogleapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.junnatun.zoogleapp.R
import com.junnatun.zoogleapp.data.AppDatabase
import com.junnatun.zoogleapp.data.entity.User
import com.junnatun.zoogleapp.databinding.ActivityMainBinding
import com.junnatun.zoogleapp.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPageBinding
    private lateinit var nama: EditText
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var konfirmPass: EditText
    private lateinit var btnSignUp: Button
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up_page)
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        val name = intent.getStringExtra("name")
//        binding.text.text=name

        nama = findViewById(R.id.inpNama)
        email = findViewById(R.id.inpEmail)
        pass = findViewById(R.id.inpPass)
        konfirmPass = findViewById(R.id.inpKonfirmPass)
        btnSignUp = findViewById((R.id.btnDaftar))
        database = AppDatabase.getInstance(applicationContext)

        btnSignUp.setOnClickListener{
            if (nama.text.isNotEmpty() && email.text.isNotEmpty() && pass.text.isNotEmpty() && konfirmPass.text.isNotEmpty() && pass == konfirmPass){
                database.userDao().insertAll(
                    User(
                        null,
                        nama.text.toString(),
                        email.text.toString(),
                        pass.text.toString(),
                )
                )
                finish()
            } else {
                Toast.makeText(applicationContext, "Silakan isi semua data dengan benar!", Toast.LENGTH_SHORT)
            }
        }

        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
//            intent.putExtra("name", "")
            startActivity(intent)
        }

        binding.btnMasuk.setOnClickListener {
            startActivity(Intent(this,LoginPage::class.java))
        }
    }
}