package desktop.minhnhut.fragmentintentscreenkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import desktop.minhnhut.define.IntentConstant
import desktop.minhnhut.method.FragmentViewCode
import desktop.minhnhut.method.IntentData
import desktop.minhnhut.screen.FirstScreen
import desktop.minhnhut.screen.SecondScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentData = IntentData().getInt(intent, IntentConstant.__TAG_DATA__, IntentConstant.__SCREEN_DEFAULT__)

        val fragmentManager = fragmentManager
        when (intentData) {
            IntentConstant.__SCREEN_DEFAULT__ -> FirstScreen(fragmentManager).show()
            IntentConstant.__SCREEN2__ ->  SecondScreen(fragmentManager).show()
        }
    }
}
