package desktop.minhnhut.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import desktop.minhnhut.define.IntentConstant
import desktop.minhnhut.fragmentintentscreenkotlin.MainActivity
import desktop.minhnhut.fragmentintentscreenkotlin.R
import desktop.minhnhut.method.IntentData
import kotlinx.android.synthetic.main.fragment_a.view.*

/**
 * Created by minhnhut on 12/16/17.
 */
class FragmentA1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.fragment_a1, container, false)
        val txtViewA1 = view.findViewById<TextView>(R.id.txtViewA1)
        txtViewA1.setOnClickListener {
//            Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT).show()
            IntentData().putInt(activity, MainActivity::class.java, IntentConstant.__TAG_DATA__, IntentConstant.__SCREEN2__)
        }
        return view
    }
}