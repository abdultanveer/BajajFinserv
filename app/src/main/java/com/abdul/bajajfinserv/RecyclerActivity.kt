package com.abdul.bajajfinserv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.abdul.bajajfinserv.data.Datasource

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmations().size.toString()
    }
}