package com.desktop.minhnhut.numberpickerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arr: Array<String> = arrayOf("Python", "C", "C++", "Java", "Android", "Kotlin", "C#")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addControls()
        addEvents()
    }

    private fun addControls() {
        numberPicker1.setMinValue(0)
        numberPicker1.setMaxValue(arr.size-1)
        numberPicker1.setDisplayedValues(arr)
        numberPicker1.setWrapSelectorWheel(true)
    }

    private fun addEvents() {
        numberPicker1.setOnValueChangedListener(object: NumberPicker.OnValueChangeListener {
            override fun onValueChange(p0: NumberPicker?, p1: Int, p2: Int) {
                textView2.text = "Old Value: " + arr[p1]
                textView3.text = "New Value: " + arr[p2]
            }
        })
    }
}
