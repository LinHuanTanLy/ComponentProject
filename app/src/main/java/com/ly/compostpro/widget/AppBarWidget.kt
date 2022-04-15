package com.ly.compostpro.widget

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TopAppBar(title: String) {
    TopAppBar(
        modifier = Modifier
            .wrapContentSize(Alignment.TopCenter),
        title = { Text(text = title, modifier = Modifier.wrapContentWidth()) },

        )
}