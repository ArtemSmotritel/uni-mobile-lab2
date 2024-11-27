package com.example.smo_uni_mobile_lab2.ui.secondTabbedActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val index: LiveData<Int> = _index
    val text: LiveData<String> = _index.map {
        "Hello world from section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}