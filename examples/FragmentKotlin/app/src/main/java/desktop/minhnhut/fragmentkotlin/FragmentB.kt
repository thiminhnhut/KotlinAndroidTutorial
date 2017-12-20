package desktop.minhnhut.fragmentkotlin

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

@Suppress("DEPRECATION")
/**
 * Created by minhnhut on 12/20/17.
 */
class FragmentB : Fragment() {
    private lateinit var listener: EventFragment
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        listener = activity as EventFragment

        val view = inflater!!.inflate(R.layout.fragment_b, container, false)

        val btnFragmentB = view.findViewById<Button>(R.id.btnFragmentB)
        btnFragmentB.setOnClickListener {
            listener.onClickButton(FragmentA())
        }

        return view
    }
}