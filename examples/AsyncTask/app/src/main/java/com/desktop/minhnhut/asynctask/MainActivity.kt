package com.desktop.minhnhut.asynctask

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnXuLy.setOnClickListener {
            XuLyCongViec().execute()
        }
    }

    inner class XuLyCongViec: AsyncTask<Void, String, String>() {
        override fun onPreExecute() {
            super.onPreExecute()
            txtNoiDung.text = "Bắt đầu thực hiện\n"
        }

        override fun doInBackground(vararg p0: Void?): String {
            for (cv in 1..5) {
                publishProgress("Xong việc $cv\n")
            }
            return "Kết thúc công việc"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            txtNoiDung.append(result)
        }

        override fun onProgressUpdate(vararg values: String?) {
            super.onProgressUpdate(*values)
            txtNoiDung.append(values[0])
        }

    }
}
