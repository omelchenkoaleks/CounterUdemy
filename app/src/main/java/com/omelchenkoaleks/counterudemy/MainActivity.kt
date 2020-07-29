package com.omelchenkoaleks.counterudemy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        textView.text = mainViewModel.getCurrentValue().toString()
    }

    fun decreaseValue(view: View) {
        textView.text = mainViewModel.getDecreaseValue().toString()
    }

    fun increaseValue(view: View) {
        textView.text = mainViewModel.getIncreaseValue().toString()
    }
}