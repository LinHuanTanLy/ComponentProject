package com.ly.compostpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.ly.compostpro.pages.MainCompose
import com.ly.compostpro.ui.theme.CompostProTheme
import com.ly.style.CustomThemeManager
import com.ly.style.themeTypeState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            val themeState = themeTypeState.value
            //设置为沉浸式状态栏
            WindowCompat.setDecorFitsSystemWindows(window, false)
            CustomThemeManager.DecTheme(themeState){
                ProvideWindowInsets{
                    SideEffect {
                        systemUiController.setStatusBarColor(Transparent, darkIcons = false)
                    }
                    MainCompose()
                }
            }
        }
    }
}


@Composable
fun Menu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        SingleBtn(msg = "登录demo", click = {

        })
        SingleBtn(msg = "登录demo", click = {
            print("dddddd")
        })

    }
}

@Composable
fun SingleBtn(msg: String, click: () -> Unit) {
    Button(onClick = click, modifier = Modifier.padding(vertical = 12.dp)) {
        Text(text = msg)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CompostProTheme {
        Menu()
    }
}