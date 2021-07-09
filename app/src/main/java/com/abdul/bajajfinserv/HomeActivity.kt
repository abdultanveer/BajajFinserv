package com.abdul.bajajfinserv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       var name =  intent.getStringExtra("mkey")
        var hTextView = findViewById<TextView>(R.id.textViewhome).apply {
            text = name
        }
       // hTextView.text = name

    }
}