package com.theone.aplicacionconpublicidad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.theone.aplicacionconpublicidad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initApp()
    }

    private fun initApp() {

        binding.toBanner.setOnClickListener {
            startActivity(Intent(this, BannerActivity::class.java ))
        }

    }
}