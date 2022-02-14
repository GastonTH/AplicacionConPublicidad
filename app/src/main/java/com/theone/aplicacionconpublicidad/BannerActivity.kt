package com.theone.aplicacionconpublicidad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.theone.aplicacionconpublicidad.databinding.ActivityBannerBinding
import com.theone.aplicacionconpublicidad.databinding.ActivityMainBinding

class BannerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBannerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBannerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initApp()
    }

    private fun initApp() {

        val adRequest: AdRequest = AdRequest.Builder().build()

        binding.banner.loadAd(adRequest)

        binding.banner.adListener = object: AdListener(){

        }
    }
}