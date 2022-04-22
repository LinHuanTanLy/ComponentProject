package com.ly.compostpro.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.ly.compostpro.widget.AppbarSearch
import com.ly.compostpro.widget.TitleBar

@Composable
fun MainCompose() {
    Scaffold(
        contentColor = MaterialTheme.colors.background,
        topBar = {
            AppbarSearch(
                title = "搜索点什么好呢～",
                leftIcon = Icons.Default.DateRange,
                leftTips = "分类",
                rightIcon = Icons.Default.Search,
                rightTips = "搜索",

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