package com.example.eweek05hw.model

import androidx.compose.runtime.mutableStateListOf
import com.example.eweek05hw.R

object ImageListFactory {
    fun makeListImage() = mutableStateListOf(
        ImageData(
            image = R.drawable.arms,
            description = "arms"
        ),
        ImageData(
            image = R.drawable.ears,
            description = "ears"
        ),
        ImageData(
            image = R.drawable.eyebrows,
            description = "eyebrows"
        ),
        ImageData(
            image = R.drawable.eyes,
            description = "eyes"
        ),
        ImageData(
            image = R.drawable.glasses,
            description = "glasses"
        ),
        ImageData(
            image = R.drawable.hat,
            description = "hat"
        ),
        ImageData(
            image = R.drawable.mouth,
            description = "mouth"
        ),
        ImageData(
            image = R.drawable.mustache,
            description = "mustache"
        ),
        ImageData(
            image = R.drawable.nose,
            description = "nose"
        ),
        ImageData(
            image = R.drawable.shoes,
            description = "shoes"
        )
    )
}