package desktop.minhnhut.screen

import android.app.Fragment
import android.app.FragmentManager
import desktop.minhnhut.fragment.FragmentA1
import desktop.minhnhut.fragment.FragmentView
import desktop.minhnhut.fragmentintentscreenkotlin.R
import desktop.minhnhut.method.FragmentViewCode

/**
 * Created by minhnhut on 12/16/17.
 */
class FirstScreen(private var fragmentManager: FragmentManager) {
    fun show() {
        FragmentViewCode(fragmentManager).add(R.layout.fragment_a, R.id.mainFrame)
        add()
    }

    private fun add() {
        val frag = FragmentViewCode(fragmentManager)
        add(R.id.a1Frame)
        frag.add(R.layout.fragment_a2, R.id.a2Frame)
    }

    private fun add(idContainerLayout: Int) {
        val fragmentView = FragmentA1()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(idContainerLayout, fragmentView)
        fragmentTransaction.commit()
    }
}