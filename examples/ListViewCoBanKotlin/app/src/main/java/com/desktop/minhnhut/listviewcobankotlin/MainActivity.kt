package com.desktop.minhnhut.listviewcobankotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arrayMonHoc: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addControls();
        addEvents();
    }


    private fun addControls() {
        addMonHoc()
        lvMonHoc.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayMonHoc)
    }

    private fun addMonHoc() {
        arrayMonHoc.add("Android")
        arrayMonHoc.add("iOS")
        arrayMonHoc.add("Python")
        arrayMonHoc.add("C/C++")
        arrayMonHoc.add("PHP")
        arrayMonHoc.add("Java")
    }


    private fun addEvents() {
        lvMonHoc.setOnItemClickListener(object: AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, "Bạn chọn ngôn ngữ [" + arrayMonHoc.get(p2) + "]", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
