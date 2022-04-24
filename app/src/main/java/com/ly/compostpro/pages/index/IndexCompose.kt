package com.ly.compostpro.pages.index

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.ly.compostpro.pages.index.found.Found
import com.ly.compostpro.widget.AppbarSearch
import com.ly.conf.RouterConf.index
import kotlinx.coroutines.launch

@Composable
@ExperimentalPagerApi
fun Index(c: NavHostController) {
    val scope = rememberCoroutineScope()
    val menu: List<String> = listOf("场景A", "场景B", "场景C", "场景D", "场景E", "场景F", "场景G")
    val pagerState = rememberPagerState(pageCount = menu.size, initialPage = 0)

    Scaffold(
        contentColor = MaterialTheme.colors.background,
        topBar = {
            AppbarSearch(
                title = "搜索点什么好呢～",
                leftIcon = Icons.Default.DateRange,
                leftTips = "分类",
                rightIcon = Icons.Default.Search,
                rightTips = "搜索",

                )
        },
        content =
        {
            Column {
                ScrollableTabRow(
                    selectedTabIndex = pagerState.currentPage,
                    edgePadding = 0.dp,
                    tabs = {
                        menu.forEachIndexed { index, item ->
                            Tab(onClick = {
                                scope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            }, selected = index == pagerState.currentPage, text = {
                                Text(
                                    text = item
                                )
                            })
                        }
                    })
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.weight(1f)
                ) { item ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        if (item == 0) {
                            Found()
                        } else
                            Text(text = menu[item], modifier = Modifier.height(100.dp))
                    }
                }

            }
        },
    )
}