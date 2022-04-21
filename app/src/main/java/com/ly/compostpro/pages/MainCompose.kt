package com.ly.compostpro.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import com.ly.compostpro.widget.AppbarSearch
import com.ly.compostpro.widget.TitleBar

@Composable
fun MainCompose() {
    Scaffold(
        contentColor = MaterialTheme.colors.background,
        topBar = {
            AppbarSearch(
                title = "首页",
                leftIcon = Icons.Default.DateRange,
                leftTips = "分类"
            )
        },
        content =
        {
            Column {
                Text(text = "dfd");

            }
        }

    )
}