package org.tensorflow.lite.examples.posenet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.FileReader

class AnswerData : AppCompatActivity(), View.OnClickListener {

    var filedata: String? = null
    var contents: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_data)

        val btnBack = findViewById<Button>(R.id.btnShoot)
        var txtData = findViewById(R.id.txtJson) as TextView

        val br = BufferedReader(FileReader(filesDir.toString() + "/Answer_Pose.json"))

        while (br.readLine().also { filedata = it } != null)
        {
            contents += filedata + "\n"
        }

        txtData?.text = contents

        br.close()
    }

    override fun onClick(v: View?) {
        finish()
    }


}