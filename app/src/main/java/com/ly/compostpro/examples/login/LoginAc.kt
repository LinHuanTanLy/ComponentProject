package com.ly.compostpro.examples.login

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import com.ly.compostpro.Menu
import com.ly.compostpro.base.BaseAc
import com.ly.compostpro.ui.theme.CompostProTheme

class LoginAc : BaseAc() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompostProTheme {


            }
        }
    }



}