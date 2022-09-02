package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController

class navActivity : AppCompatActivity() {
    private  lateinit var  navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)
        val navHostFragment =supportFragmentManager.findFragmentById(R.id.mainContainer)as navHostFragment
        navController =navHostFragment.navController
         val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
       setupWithNavControler(bottomNavigationView ,navController)
    }
}