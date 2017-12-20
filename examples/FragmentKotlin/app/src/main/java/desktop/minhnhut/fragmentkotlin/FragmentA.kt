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
class FragmentA: Fragment() {
    private lateinit var listener: EventFragment

    companion object {

        fun newInstance(): FragmentA {
            return FragmentA()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        listener = activity as EventFragment

        val view = inflater!!.inflate(R.layout.fragment_a, container, false)

        val btnFragmentA = view.findViewById<Button>(R.id.btnFragmentA)
        btnFragmentA.setOnClickListener {
            listener.onClickButton(FragmentB())
        }

        return view
    }

}