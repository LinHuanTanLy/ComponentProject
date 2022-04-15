package com.ly.compostpro.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ly.compostpro.ui.theme.CompostProTheme

abstract class BaseAc : ComponentActivity() {


    @Composable
    fun topAppBar(title: String) {
        TopAppBar(
            modifier = Modifier
                .wrapContentSize(Alignment.TopCenter),
            title = { Text(text = title, modifier = Modifier.wrapContentWidth()) },

            )
    }


}