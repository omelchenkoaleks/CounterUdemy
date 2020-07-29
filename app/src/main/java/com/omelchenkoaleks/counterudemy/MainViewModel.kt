package com.omelchenkoaleks.counterudemy

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = 1

    fun getCurrentValue(): Int {
        return counter
    }

    fun getDecreaseValue(): Int {
        return --counter
    }

    fun getIncreaseValue(): Int {
        return ++counter
    }
 }