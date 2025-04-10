package com.example.eweek05hw.uicomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.eweek05hw.model.ImageData
import com.example.eweek05hw.model.ImageStatus

@Composable
fun ImageList(modifier: Modifier = Modifier, imageList: List<ImageData>) {
    Box(modifier = modifier.fillMaxSize()) {
        imageList.forEach { imageData ->
            if (imageData.status == ImageStatus.SHOW) {
                Image(
                    painter = painterResource(id = imageData.image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}
