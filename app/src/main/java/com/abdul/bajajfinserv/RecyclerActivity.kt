package com.abdul.bajajfinserv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdul.bajajfinserv.adapter.ItemAdapter
import com.abdul.bajajfinserv.data.Datasource

class RecyclerActivity : AppCompatActivity() {
    val TAG = RecyclerActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        /*val textView: TextView = findViewById(R.id.textViewRA)
        textView.text = Datasource().loadAffirmations().size.toString()*/
        Log.i(TAG,"onCreate")

        val myDataset = Datasource().loadAffirmations()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)//layout manager arranges the views horizontally/vertically/staggered grid
    }
}