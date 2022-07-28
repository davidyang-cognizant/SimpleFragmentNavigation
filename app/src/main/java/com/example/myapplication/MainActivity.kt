package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.firstFragment, R.id.secondFragment))
        val bottomNav = findViewById<BottomNavigationView>(R.id.nav)
        val navController = findNavController(R.id.fragmentContainerView)
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNav.setupWithNavController(navController)
    }
}