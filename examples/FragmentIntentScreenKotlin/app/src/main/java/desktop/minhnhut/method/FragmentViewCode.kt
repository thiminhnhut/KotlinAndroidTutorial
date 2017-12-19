package desktop.minhnhut.method

import android.app.FragmentManager
import desktop.minhnhut.fragment.FragmentView

/**
 * Created by minhnhut on 12/16/17.
 */
class FragmentViewCode(private var fragmentManager: FragmentManager) {
    fun add(resourceFragmentLayout: Int, idContainerLayout: Int) {
        val fragmentView = FragmentView(resourceFragmentLayout)
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(idContainerLayout, fragmentView)
        fragmentTransaction.commit()
    }
}