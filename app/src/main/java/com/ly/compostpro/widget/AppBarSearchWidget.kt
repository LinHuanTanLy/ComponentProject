package com.ly.compostpro.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.statusBarsHeight


@Composable
fun AppbarSearch(
    title: String, leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    leftTips: String? = null,
    rightTips: String? = null,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
) {
    Column {
        Spacer(
            modifier = Modifier
                .background(MaterialTheme.colors.primaryVariant)
                .statusBarsHeight()
                .fillMaxWidth()
        )
        AppbarSearchWidget(
            title = title,
            leftIcon = leftIcon,
            rightIcon = rightIcon,
            leftTips = leftTips,
            rightTips = rightTips,
            onLeftClick = onLeftClick,
            onRightClick = onRightClick
        )
    }
}


@Composable
fun AppbarSearchWidget(
    title: String,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    leftTips: String? = null,
    rightTips: String? = null
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
                    Column(
                        modifier = Modifier.clickable {
                            onLeftClick()
                        }.padding(start = 12.dp), horizontalAlignment =Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(leftIcon, contentDescription = null, modifier = Modifier
                            .clickable {
                                onLeftClick()
                            }.size(24.dp)
                            , tint = MaterialTheme.colors.background)
                        leftTips?.let {
                            Box(contentAlignment = Alignment.Center,) {
                                Text(text = it, fontSize = 10.sp, color = Color.White)
                            }
                        }
                    }
                if (rightIcon == null)
                    Spacer(modifier = Modifier.size(10.dp))
                else
                    Column(modifier = Modifier.clickable {
                        onLeftClick()
                    }) {
                        Icon(rightIcon, contentDescription = null, modifier = Modifier
                            .clickable {
                                onRightClick()
                            }
                            .padding(start = 10.dp), tint = MaterialTheme.colors.background)
                    }
            }
            Text(text = title, fontSize = 18.sp, color = Color.White)
        }
    }
}