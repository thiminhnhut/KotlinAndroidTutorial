package com.desktop.minhnhut.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnChuyenManHinh.setOnClickListener {
           //val intent: Intent = Intent(this@MainActivity, SeccondActivity::class.java)
           val intent: Intent = Intent(applicationContext, SeccondActivity::class.java)
           intent.putExtra("data", "ABCDEF")
           startActivity(intent)
       }
    }
}

