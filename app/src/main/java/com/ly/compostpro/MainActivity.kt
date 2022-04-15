package com.ly.compostpro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ly.compostpro.base.BaseAc
import com.ly.compostpro.ui.theme.CompostProTheme

class MainActivity : BaseAc() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompostProTheme {
                Scaffold(
                    topBar = { topAppBar(title = "demo") },
                    content = { Menu() }
                )

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