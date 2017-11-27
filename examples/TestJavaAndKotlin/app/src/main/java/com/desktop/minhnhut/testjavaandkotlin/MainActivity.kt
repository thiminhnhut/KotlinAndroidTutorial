package com.desktop.minhnhut.testjavaandkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.desktop.minhnhut.model_java.FunctionJava
import com.desktop.minhnhut.model_kotlin.FunctionKotlin
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    var fjava = FunctionJava()
    var fkotlin = FunctionKotlin()
    var check: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTinh.setOnClickListener {
            var a: Int = parseInt(txtA.text.toString())
            var b: Int = parseInt(txtB.text.toString())
            var c: Int = 0

            check = !check
            if (check) {
                c = fjava.tong_java(a, b)
            } else {
                c = fkotlin.tich_kotlin(a, b)
            }


            txtKQ.text=c.toString()
        }
    }
}
