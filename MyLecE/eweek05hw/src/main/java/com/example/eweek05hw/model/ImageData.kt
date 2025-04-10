package com.example.eweek05hw.model

import androidx.compose.runtime.saveable.listSaver

data class ImageData(
    val image: Int,
    var status: ImageStatus = ImageStatus.NOSHOW,
    val description: String
    ) {
    companion object{
        val ImageSaver = listSaver<ImageData, Any>(
            save = {item ->
                listOf(
                    item.image,
                    item.status,
                    item.description
                )
            },
            restore = {list ->
                val image = list[0]
                ImageData(
                    image = image as Int,
                    status = list[1] as ImageStatus,
                    description = list[2] as String
                )
            }
        )
    }
}
