package com.ly.compostpro.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ly.compostpro.widget.TopAppBar

@Composable
fun MainCompose() {
    Scaffold(
        contentColor = MaterialTheme.colors.background,
//        topBar = { TopAppBar(title = "首页") },
        content =
        { Column {
            Text(text = "dfd");

        } }

    )
}