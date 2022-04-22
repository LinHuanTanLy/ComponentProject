package com.ly.compostpro.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.statusBarsHeight
import com.ly.style.cFF445E
import com.ly.style.cFFFFFF


@Composable
fun AppbarSearch(
    title: String, leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    leftTips: String? = null,
    rightTips: String? = null,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
    onCenterClick: () -> Unit = {},
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
            onRightClick = onRightClick,
            onCenterClick = onCenterClick
        )
    }
}


@Composable
fun AppbarSearchWidget(
    title: String,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
    onCenterClick: () -> Unit = {},
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
                        modifier = Modifier
                            .clickable {
                                onLeftClick()
                            }
                            .padding(start = 12.dp, top = 2.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(leftIcon, contentDescription = null, modifier = Modifier
                            .clickable {
                                onLeftClick()
                            }
                            .size(24.dp), tint = MaterialTheme.colors.background
                        )
                        Spacer(modifier = Modifier.size(2.dp))
                        leftTips?.let {
                            Box(contentAlignment = Alignment.Center) {
                                Text(text = it, fontSize = 10.sp, color = Color.White)
                            }
                        }
                    }
                if (rightIcon == null)
                    Spacer(modifier = Modifier.size(10.dp))
                else
                    Column(
                        modifier = Modifier
                            .clickable {
                                onRightClick()
                            }
                            .padding(end = 12.dp, top = 2.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(rightIcon, contentDescription = null, modifier = Modifier
                            .clickable {
                                onLeftClick()
                            }
                            .size(24.dp), tint = MaterialTheme.colors.background
                        )
                        Spacer(modifier = Modifier.size(2.dp))
                        rightTips?.let {
                            Box(contentAlignment = Alignment.Center) {
                                Text(text = it, fontSize = 10.sp, color = Color.White)
                            }
                        }
                    }
            }
            Surface(
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(width = 1.dp, color = cFFFFFF),
                color = Color.Transparent,
                modifier = Modifier
                    .width(250.dp)
                    .height(34.dp)
                    .align(Alignment.Center)
                    .clickable { onCenterClick() },
                content = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = title,
                            fontSize = 14.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 12.dp, end = 12.dp)
                        )
                    }
                },
            )
        }
    }
}