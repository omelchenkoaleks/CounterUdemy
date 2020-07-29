package com.omelchenkoaleks.counterudemy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decreaseValue(view: View) {
        count--
        textView.text = count.toString()
    }

    fun increaseValue(view: View) {
        count++
        textView.text = count.toString()
    }
}