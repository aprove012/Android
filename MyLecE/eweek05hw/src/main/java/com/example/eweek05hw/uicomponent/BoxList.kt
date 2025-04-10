package com.example.eweek05hw.uicomponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.eweek05hw.model.ImageData
import com.example.eweek05hw.model.ImageStatus
import com.example.eweek05hw.viewmodel.ImageViewModel

@Composable
fun BoxList(modifier: Modifier = Modifier, imageList: MutableList<ImageData>) {
    val rows = imageList.chunked(2)

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        rows.forEach { pair ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                pair.forEach { item ->
                    Box(modifier = Modifier.width(140.dp)) {
                        ImageCheckBox(
                            checked = item.status == ImageStatus.SHOW,
                            description = item.description
                        ) { isChecked ->
                            val index = imageList.indexOf(item)
                            if (index != -1) {
                                imageList[index] = item.copy(
                                    status = if (isChecked) ImageStatus.SHOW else ImageStatus.NOSHOW
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview
@Composable
private fun BoxListPreview() {
    val imageViewModel: ImageViewModel = viewModel()
    val imageList = imageViewModel.imageList
    BoxList(
        modifier = Modifier.fillMaxSize(), imageList = imageList
    )
}
