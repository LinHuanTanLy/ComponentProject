package com.ly.compostpro.ui.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.ly.compostpro.pages.index.Index
import com.ly.compostpro.pages.mine.Mine
import com.ly.compostpro.pages.square.Square
import com.ly.conf.RouterConf

@Composable
@ExperimentalPagerApi
fun NavHostWidget(navController: NavHostController) {

    NavHost(navController = navController, RouterConf.index) {
        composable(RouterConf.index) {
            Index(navController)
        }
        composable(RouterConf.mine) {
            Mine(navController)
        }
        composable (RouterConf.square){
            Square(navController)
        }
    }

}

