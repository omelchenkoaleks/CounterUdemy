package com.omelchenkoaleks.counterudemy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    private lateinit var liveData: MutableLiveData<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        liveData = mainViewModel.getCurrentValue()
        liveData.observe(this, Observer {
            textView.text = it.toString()
        })
    }

    fun decreaseValue(view: View) {
        mainViewModel.getDecreaseValue().toString()
    }

    fun increaseValue(view: View) {
        mainViewModel.getIncreaseValue().toString()
    }
}