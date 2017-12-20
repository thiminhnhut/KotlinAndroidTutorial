package desktop.minhnhut.fragmentkotlin

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), EventFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            fragmentManager
                    .beginTransaction()
                    .add(R.id.layout_root, FragmentA.newInstance())
                    .commit()
        }
    }

    override fun onClickButton(fragment: Fragment) {
        fragmentManager
                .beginTransaction()
                .replace(R.id.layout_root, fragment)
                .commit()
    }
}
