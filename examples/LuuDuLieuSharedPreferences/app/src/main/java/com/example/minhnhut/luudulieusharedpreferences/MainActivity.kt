package com.example.minhnhut.luudulieusharedpreferences

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val __KEY_GAME_SETTINGS__ = "gameSettings"
    private val __KEY_SOUND__ = "sound"
    private val __KEY_BRIGHTNESS__ = "brightness"
    private val __KEY_RADIO__ = "radio"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadGameSettings()

        doSave()
    }

    private fun doSave() {
        btnSave.setOnClickListener {
            val sharedPreferences : SharedPreferences = getSharedPreferences(__KEY_GAME_SETTINGS__, Context.MODE_PRIVATE)
            val editor : SharedPreferences.Editor = sharedPreferences.edit()

            editor.putInt(__KEY_SOUND__, seekBarSound.progress)
            editor.putInt(__KEY_BRIGHTNESS__, seekBarBrightness.progress)
            editor.putInt(__KEY_RADIO__, radioButton.checkedRadioButtonId)

            editor.apply()

            Toast.makeText(this, "Game Settings Save!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadGameSettings() {
        val sharedPreferences : SharedPreferences? = getSharedPreferences(__KEY_GAME_SETTINGS__, Context.MODE_PRIVATE)
        if (sharedPreferences != null) {
            seekBarSound.progress = sharedPreferences.getInt(__KEY_SOUND__, 0)
            seekBarBrightness.progress = sharedPreferences.getInt(__KEY_BRIGHTNESS__, 0)
            radioButton.check(sharedPreferences.getInt(__KEY_RADIO__, 0))
        } else {
            Toast.makeText(this, "No Game Settings", Toast.LENGTH_SHORT).show()
        }
    }
}
