package com.example.stocknews.ui


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.stocknews.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       setUpNavigation()
    }
    private fun setUpNavigation() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController())
    }


}