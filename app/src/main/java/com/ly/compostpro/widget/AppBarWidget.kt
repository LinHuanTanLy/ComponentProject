package com.ly.compostpro.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.statusBarsHeight

@Composable
fun TopAppBar(title: String) {
    TopAppBar(
        modifier = Modifier
            .wrapContentSize(Alignment.TopCenter)
            .height(54.dp),
        backgroundColor = MaterialTheme.colors.primary,
        elevation = 0.dp,
    ) {
        Column {
            Spacer(
                modifier = Modifier
                    .background(MaterialTheme.colors.primary)
                    .statusBarsHeight()
                    .fillMaxWidth()
            ); Box(
            contentAlignment = Alignment.Center
        ) {
            //标题文字
            Text(
                text = title,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                color = Color(0xff3c3c3c)

            )
        }
        }
    }
}