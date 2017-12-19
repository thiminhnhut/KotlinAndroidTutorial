package desktop.minhnhut.method

import android.app.Activity
import android.content.Intent

/**
 * Created by minhnhut on 12/16/17.
 */
class IntentData {
    fun getInt(intent: Intent, tagData: String, valueDefault: Int): Int {
        return intent.getIntExtra(tagData, valueDefault)
    }

    fun putInt(activity: Activity, cls: Class<*>, tagData: String, value: Int) {
        val intent = Intent(activity, cls)
        intent.putExtra(tagData, value)
        activity.startActivity(intent)
    }
}