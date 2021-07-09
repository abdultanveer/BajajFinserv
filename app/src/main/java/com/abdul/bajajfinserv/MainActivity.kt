package com.abdul.bajajfinserv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {  //why the word compat,
     lateinit var nameEditText: EditText   //declaration
     lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//show/inflate activity_main file
        nameEditText = findViewById(R.id.editTextTextPersonName) //instantiation, initialization
        textView = findViewById(R.id.resTextview)
    }

    fun clickHandler(view: View) {
        textView.text = nameEditText.text
        Toast.makeText(this,nameEditText.text,Toast.LENGTH_SHORT).show()
        var homeIntent: Intent;
        homeIntent = Intent(this,HomeActivity::class.java).apply {
            putExtra("mkey", nameEditText.text)
        }
        startActivity(homeIntent)

    }
}