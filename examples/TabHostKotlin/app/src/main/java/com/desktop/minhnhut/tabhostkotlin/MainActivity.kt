package com.desktop.minhnhut.tabhostkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TabHost
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.manhinh1.*
import kotlinx.android.synthetic.main.manhinh1.view.*
import kotlinx.android.synthetic.main.manhinh2.*

class MainActivity : AppCompatActivity() {

    private var arrLichSu: ArrayList<String> = arrayListOf()
    private var arrAdapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addControls()
        addEvents()
    }

    private fun addControls() {
        tabHost.setup()

        var tab1: TabHost.TabSpec = tabHost.newTabSpec("t1")
        tab1.setContent(R.id.tab1)
        tab1.setIndicator("1. Phép cộng")
        tabHost.addTab(tab1)

        var tab2: TabHost.TabSpec = tabHost.newTabSpec("t2")
        tab2.setContent(R.id.tab2)
        tab2.setIndicator("2. Lịch sử")
        tabHost.addTab(tab2)

        arrAdapter = ArrayAdapter<String>(this@MainActivity, android.R.layout.simple_list_item_1, arrLichSu)
        lvLichSu.adapter = arrAdapter
    }

    private fun addEvents() {
        btnCong.setOnClickListener {
            var a: Int = txtA.text.toString().toInt()
            var b: Int = txtB.text.toString().toInt()

            var c: Int = a + b

            arrLichSu.add("$a + $b = $c")
            arrAdapter?.notifyDataSetChanged()

            txtA.text = null
            txtB.text = null
        }
    }
}
