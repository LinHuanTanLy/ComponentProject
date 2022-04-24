package com.ly.compostpro.widget

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.ly.conf.RouterConf
import com.ly.model.nav.NavModel

@Composable
fun BottomNavigationWidget(navController: NavHostController) {
    val list = listOf(
        NavModel(0, "首页", Icons.Default.Home,RouterConf.index),
        NavModel(1, "广场", Icons.Default.Face,RouterConf.square),
        NavModel(2, "我的", Icons.Default.ThumbUp,RouterConf.mine),
    )
    val currIndex = remember {
        mutableStateOf(0)
    }

    BottomNavigation {
        list.forEach { item ->

            //记录动画
            val translationY = remember { androidx.compose.animation.core.Animatable(0F) }

            LaunchedEffect(currIndex.value) {
                if (item.id == currIndex.value) {
                    translationY.animateTo(-4F)
                } else {
                    translationY.animateTo(0F)
                }
            }

            BottomNavigationItem(
                icon = {
                    Icon(
                        item.icon,
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .offset(
                                0.dp,
                                //上下偏移
                                translationY.value.dp
                            )
                    )
                },
                label = { Text(text = item.menu) },
                onClick = {
                    currIndex.value = item.id
                    navController.navigate(item.router) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        //避免重建
                        launchSingleTop = true
                        //重新选择以前选择的项目时，恢复状态
                        restoreState = true
                    }
                },
                selected = currIndex.value == item.id
            )
        }
    }
}