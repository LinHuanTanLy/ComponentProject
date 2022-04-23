package com.ly.compostpro.widget

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationWidget(){
    val list= listOf<String>("首页","广场","我的")
    val icons= listOf<ImageVector>(Icons.Default.Home,Icons.Default.ThumbUp,Icons.Default.Person)
    val selectIndex = remember {
        mutableStateOf(0)
    }

}