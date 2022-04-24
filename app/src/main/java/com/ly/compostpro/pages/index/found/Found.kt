package com.ly.compostpro.pages.index.found

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.ly.compostpro.widget.banner.Banner
import com.ly.style.cFF445E
import com.ly.style.cFFFFFF

@Composable
@ExperimentalPagerApi
fun Found() {


    Column(
        horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top,
        ) {
        Banner(
            imgs = listOf(
                "https://t7.baidu.com/it/u=1956604245,3662848045&fm=193&f=GIF",
                "https://t7.baidu.com/it/u=2529476510,3041785782&fm=193&f=GIF",
            ),
            modifier = Modifier.height(140.dp).padding(vertical = 4.dp, horizontal = 4.dp)
        )
    }

}