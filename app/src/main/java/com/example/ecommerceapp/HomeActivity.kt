package com.example.ecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_intent2 = findViewById<Button>(R.id.btn_intent2)
        btn_intent2.setOnClickListener {
            val button_intent2 = Intent(this, SplashActivity::class.java)
            startActivity(button_intent2)
        }
    }
}