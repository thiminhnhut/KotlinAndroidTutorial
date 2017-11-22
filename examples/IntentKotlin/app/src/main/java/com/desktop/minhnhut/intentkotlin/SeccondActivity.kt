package com.desktop.minhnhut.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seccond.*

class SeccondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seccond)

        val hoten: String = intent.getStringExtra("data")
        tv_HoTen.text = hoten.toString()

    }
}
