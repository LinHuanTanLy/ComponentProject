package com.ly.compostpro.pages

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ly.compostpro.ui.nav.NavHostWidget
import com.ly.compostpro.widget.BottomNavigationWidget

@Composable
fun MainCompose() {
    val navController = rememberNavController()
    Scaffold(
        contentColor = MaterialTheme.colors.background,
        content =
        { _ ->
            NavHostWidget(navController)
        },
        bottomBar = {
            BottomNavigationWidget(navController)
        }

    )
}