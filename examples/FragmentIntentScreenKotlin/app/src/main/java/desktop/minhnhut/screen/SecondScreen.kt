package desktop.minhnhut.screen

import android.app.Fragment
import android.app.FragmentManager
import desktop.minhnhut.fragmentintentscreenkotlin.R
import desktop.minhnhut.method.FragmentViewCode

/**
 * Created by minhnhut on 12/16/17.
 */
class SecondScreen(private var fragmentManager: FragmentManager) {
    fun show() {
        FragmentViewCode(fragmentManager).add(R.layout.fragment_b, R.id.mainFrame)
        add()
    }

    private fun add() {
        val frag = FragmentViewCode(fragmentManager)
        frag.add(R.layout.fragment_b1, R.id.b1Frame)
        frag.add(R.layout.fragment_b2, R.id.b2Frame)
    }
}