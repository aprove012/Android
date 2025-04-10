package com.example.eweek05hw.viewmodel

import androidx.lifecycle.ViewModel
import com.example.eweek05hw.model.ImageData
import com.example.eweek05hw.model.ImageListFactory

class ImageViewModel : ViewModel() {
    private val _imageList = ImageListFactory.makeListImage()
    val imageList: MutableList<ImageData>
        get() = _imageList
}