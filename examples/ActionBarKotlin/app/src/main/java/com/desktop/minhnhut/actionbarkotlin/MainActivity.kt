package com.desktop.minhnhut.actionbarkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.mnCheck -> {
                Toast.makeText(this@MainActivity, "Check 1", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.mnDelete -> {
                Toast.makeText(this@MainActivity, "Check 2", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.pin -> {
                val intent = Intent(this@MainActivity, Screen2Activity::class.java)
                startActivity(intent)

                return super.onOptionsItemSelected(item)
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}
