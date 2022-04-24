package com.ly.compostpro.widget.banner
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.ly.compostpro.widget.image.ImgView

@Composable
@ExperimentalPagerApi
fun Banner(imgs: List<String>, modifier: Modifier) {
    val pagerState = rememberPagerState(pageCount = imgs.size, initialPage = 0, infiniteLoop = true)
    HorizontalPager(state = pagerState, modifier = modifier) {
        ImgView(img = imgs[it])
    }
}