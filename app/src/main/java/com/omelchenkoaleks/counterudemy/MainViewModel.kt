package com.omelchenkoaleks.counterudemy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = 1
    private val liveData = MutableLiveData<Int>()

    fun getCurrentValue(): MutableLiveData<Int> {
        liveData.value = counter
        return liveData
    }

    fun getDecreaseValue() {
        --counter
        liveData.value = counter
    }

    fun getIncreaseValue() {
        ++counter
        liveData.value = counter
    }
}