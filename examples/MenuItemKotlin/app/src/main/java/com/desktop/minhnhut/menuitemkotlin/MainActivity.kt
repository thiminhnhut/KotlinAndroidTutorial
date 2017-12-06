package com.desktop.minhnhut.menuitemkotlin

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
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.item1 -> {
                Toast.makeText(this@MainActivity, "Item 1 is Select", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.item2 -> {
                Toast.makeText(this@MainActivity, "Item 2 is Select", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            R.id.item3 -> {
                Toast.makeText(this@MainActivity, "Item 3 is Select", Toast.LENGTH_SHORT).show()
                return super.onOptionsItemSelected(item)
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }
}
