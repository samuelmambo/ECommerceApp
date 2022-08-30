package com.example.ecommerceapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Button with intent

        val btn = findViewById<Button>(R.id.btn_intent)


        btn.setOnClickListener {
           val try_intent = Intent(this,HomeActivity::class.java)
            startActivity(try_intent)
        }
    }
}