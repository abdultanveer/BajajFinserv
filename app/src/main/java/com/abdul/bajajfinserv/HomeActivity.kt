package com.abdul.bajajfinserv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var etHome: EditText

    var TAG = HomeActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.i(TAG,"oncreate")
        etHome = findViewById<EditText>(R.id.etHome)

      /* var name =  intent.getStringExtra("mkey")
        var hTextView = findViewById<TextView>(R.id.textViewhome).apply {
            text = name
        }*/
       // hTextView.text = name

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onstart")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onresume -- restore the game state")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onpause --- store the game state")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onstop")

    }

    fun sendResult(view: View) {
        var result = etHome.text.toString()
        var resIntent = Intent()
        resIntent.putExtra("resultkey",result)
        setResult(RESULT_OK,resIntent)
        finish()

    }
}