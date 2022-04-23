package com.ly.compostpro.pages.index

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.ly.compostpro.widget.AppbarSearch

@Composable
fun Index(c: NavHostController) {
    Scaffold(contentColor = MaterialTheme.colors.background,
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
        { _ ->

        },
//        bottomBar = {
//            BottomNavigation() {
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
//                    label = { Text(text = "首页") },
//                    onClick = {},
//                    selected = true
//                )
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
//                    onClick = {},
//                    selected = true,
//
//                    )
//                BottomNavigationItem(
//                    icon = { Icon(Icons.Default.ThumbUp, contentDescription = null) },
//                    onClick = {},
//                    selected = true
//                )
//
//            }
//        }

    )
}