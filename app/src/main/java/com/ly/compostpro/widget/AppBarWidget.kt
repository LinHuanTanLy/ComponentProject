package com.ly.compostpro.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.statusBarsHeight


@Composable
fun TitleBar(title: String) {
    Column {
        Spacer(
            modifier = Modifier
                .background(MaterialTheme.colors.primaryVariant)
                .statusBarsHeight()
                .fillMaxWidth()
        )
        TopAppBar(title = title)
    }
}


@Composable
fun TopAppBar(
    title: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {}
) {
    TopAppBar(
        modifier = Modifier
            .wrapContentSize(Alignment.TopCenter)
            .height(54.dp),
        backgroundColor = MaterialTheme.colors.primaryVariant,
        elevation = 0.dp,
    ) {
        Box(
            contentAlignment = Alignment.Center

        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                if (leftIcon == null)
                    Spacer(modifier = Modifier.size(10.dp))
                else
                    Icon(leftIcon, contentDescription = null, modifier = Modifier
                        .clickable {
                            onLeftClick()
                        }
                        .padding(start = 10.dp), tint = MaterialTheme.colors.background)
                if (rightIcon == null)
                    Spacer(modifier = Modifier.size(10.dp))
                else
                    Icon(rightIcon, contentDescription = null, modifier = Modifier
                        .clickable {
                            onRightClick()
                        }
                        .padding(start = 10.dp), tint = MaterialTheme.colors.background)
            }
            Text(text = title, fontSize = 18.sp, color = Color.White)
        }
    }
}