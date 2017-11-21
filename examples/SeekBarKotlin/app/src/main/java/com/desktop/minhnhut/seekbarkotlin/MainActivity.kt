package com.desktop.minhnhut.seekbarkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar1.max = 50
        seekBar2.max = 50

        seekBar1.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtValue1.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar) {
                txtValue1.text = p0.progress.toString()
            }

            override fun onStopTrackingTouch(p0: SeekBar) {
                txtValue1.text = p0.progress.toString()
            }
        })

        seekBar2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtValue2.text = p1.toString().toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar) {
                txtValue2.text = p0.progress.toString()
            }

            override fun onStopTrackingTouch(p0: SeekBar) {
                txtValue2.text = p0.progress.toString()
            }
        })

        btnSum.setOnClickListener {
            var value1: Int = Integer.parseInt(txtValue1.text.toString())
            var value2: Int = Integer.parseInt(txtValue2.text.toString())
            txtSum.text = (value1 + value2).toString()
        }

    }
}
