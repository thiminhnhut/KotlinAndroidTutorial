package desktop.minhnhut.fragment

import android.annotation.SuppressLint
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import desktop.minhnhut.define.IntentConstant
import desktop.minhnhut.fragmentintentscreenkotlin.MainActivity
import desktop.minhnhut.fragmentintentscreenkotlin.R
import desktop.minhnhut.method.IntentData

/**
 * Created by minhnhut on 12/16/17.
 */
@SuppressLint("ValidFragment")
class FragmentView(private var idResource: Int): Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(idResource, container, false)
        return view
    }

}