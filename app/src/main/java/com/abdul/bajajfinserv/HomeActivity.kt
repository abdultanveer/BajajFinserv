package com.abdul.bajajfinserv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var etHome: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        etHome = findViewById<EditText>(R.id.etHome)

      /* var name =  intent.getStringExtra("mkey")
        var hTextView = findViewById<TextView>(R.id.textViewhome).apply {
            text = name
        }*/
       // hTextView.text = name

    }

    fun sendResult(view: View) {
        var result = etHome.text.toString()
        var resIntent = Intent()
        resIntent.putExtra("resultkey",result)
        setResult(RESULT_OK,resIntent)
        finish()

    }
}