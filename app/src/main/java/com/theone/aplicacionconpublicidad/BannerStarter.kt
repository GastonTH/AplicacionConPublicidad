package com.theone.aplicacionconpublicidad

import android.app.Application
import com.google.android.gms.ads.MobileAds

class BannerStarter: Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}