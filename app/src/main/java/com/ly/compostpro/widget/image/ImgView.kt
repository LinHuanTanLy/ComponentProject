package com.ly.compostpro.widget.image
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberImagePainter
import coil.transform.RoundedCornersTransformation

@Composable
fun ImgView(img:String,modifier: Modifier){

    Image(
        painter = rememberImagePainter(
            img,
            builder = {
                //可以单独设置4个角的圆角度
                transformations(RoundedCornersTransformation(50f, 50f, 30f, 30f))
            },
        ),
        modifier = modifier,
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}