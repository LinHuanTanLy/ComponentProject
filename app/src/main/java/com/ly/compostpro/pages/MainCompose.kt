package com.ly.compostpro.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.ly.compostpro.ui.nav.NavHostWidget
import com.ly.compostpro.widget.AppbarSearch
import com.ly.compostpro.widget.TitleBar
import com.ly.conf.RouterConf
import com.ly.style.cFF445E
import com.ly.style.cFFFFFF

@Composable
fun MainCompose() {
    val navController = rememberNavController()
    val currIndex =  remember {
        mutableStateOf(0)
    }
    Scaffold(
        contentColor = MaterialTheme.colors.background,
//        topBar = {
//            AppbarSearch(
//                title = "搜索点什么好呢～",
//                leftIcon = Icons.Default.DateRange,
//                leftTips = "分类",
//                rightIcon = Icons.Default.Search,
//                rightTips = "搜索",
//
//                )
//        },
        content =
        { _ ->
            NavHostWidget(navController)
//            Column {
//                Text(text = "dfd", color = Color.Black);
//
//            }
        },
        bottomBar = {
            BottomNavigation() {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text(text = "首页") },
                    onClick = {
                        currIndex.value = 0
                        navController.navigate(RouterConf.index) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            //避免重建
                            launchSingleTop = true
                            //重新选择以前选择的项目时，恢复状态
                            restoreState = true
                        }
                    },
                    selected = currIndex.value == 0
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Face, contentDescription = null) },
                    label = { Text(text = "广场") },
                    onClick = {
                        currIndex.value = 1
                        navController.navigate(RouterConf.mine) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            //避免重建
                            launchSingleTop = true
                            //重新选择以前选择的项目时，恢复状态
                            restoreState = true
                        }
                    },
                    selected = currIndex.value == 1,

                    )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.ThumbUp, contentDescription = null) },
                    label = { Text(text = "我的") },
                    onClick = {
                        currIndex.value = 2
                        navController.navigate(RouterConf.square) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            //避免重建
                            launchSingleTop = true
                            //重新选择以前选择的项目时，恢复状态
                            restoreState = true
                        }
                    },
                    selected = currIndex.value == 2
                )

            }
        }

    )
}