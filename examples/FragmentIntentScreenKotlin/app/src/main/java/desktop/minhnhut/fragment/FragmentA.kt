package desktop.minhnhut.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import desktop.minhnhut.fragmentintentscreenkotlin.R
import kotlinx.android.synthetic.main.fragment_a.view.*

/**
 * Created by minhnhut on 12/16/17.
 */
class FragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_a, container, false)
    }
}