package desktop.minhnhut.switchcompatbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_id.setOnCheckedChangeListener {compoundButton, b ->
            txtView.text = "Switch is " + if (switch_id.isChecked) "On" else "Off"
        }

    }
}
