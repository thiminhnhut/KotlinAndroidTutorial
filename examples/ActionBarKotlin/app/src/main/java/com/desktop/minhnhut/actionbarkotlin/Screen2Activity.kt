package com.desktop.minhnhut.actionbarkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.mnCheck -> {
                Toast.makeText(this@Screen2Activity, "Check 1", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.mnDelete -> {
                Toast.makeText(this@Screen2Activity, "Check 2", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.pin -> {
                val intent = Intent(this@Screen2Activity, Screen3Activity::class.java)
                startActivity(intent)

                return super.onOptionsItemSelected(item)
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}
