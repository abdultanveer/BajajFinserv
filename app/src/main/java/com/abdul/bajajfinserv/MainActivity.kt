package com.abdul.bajajfinserv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {  //why the word compat,
     lateinit var nameEditText: EditText   //declaration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.editTextTextPersonName) //instantiation, initialization
    }

    fun clickHandler(view: View) {
        Toast.makeText(this,nameEditText.text,Toast.LENGTH_SHORT).show()
    }
}