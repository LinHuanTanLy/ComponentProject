package com.ly.application
import com.tencent.mmkv.MMKV
import android.app.Application

class LyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initMMkv()
    }


    fun initMMkv(){
        val rootDir: String = MMKV.initialize(this)
    }
}