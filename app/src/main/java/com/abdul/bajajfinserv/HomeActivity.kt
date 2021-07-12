package com.abdul.bajajfinserv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class HomeActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    lateinit var etHome: EditText
    lateinit var button: Button

    var TAG = HomeActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) //layout inflater
        val dishes = arrayListOf<String>("noodles","spaghetti","pasta","vada pav")
        val listview: ListView = findViewById<ListView>(R.id.dishesListview)

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,dishes)
        listview.adapter = arrayAdapter
        listview.setOnItemClickListener(this)

        Log.i(TAG,"oncreate")
        etHome = findViewById<EditText>(R.id.etHome) //taking handle on the edittext that was inflated
        button = findViewById(R.id.buttonSend)
        registerForContextMenu(button)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_home,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.fMenuItem -> { Toast.makeText(this,"first item selected",Toast.LENGTH_SHORT).show()}
            R.id.sMenuItem -> { Toast.makeText(this,"second item selected",Toast.LENGTH_SHORT).show()}

        }
        return true
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_home,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
         super.onContextItemSelected(item)
        when(item.itemId){
            R.id.fMenuItem -> {Toast.makeText(this, "context first item selected",Toast.LENGTH_SHORT).show()}
        }
        return true;
    }


    fun sendResult(view: View) {
        var result = etHome.text.toString()
        var resIntent = Intent()
        resIntent.putExtra("resultkey",result)
        setResult(RESULT_OK,resIntent)
        finish()

    }

    override fun onItemClick(adapterview: AdapterView<*>?, row: View?, position: Int, rowId: Long) {
        var nameItem = adapterview?.getItemAtPosition(position)
        Toast.makeText(this,"clicke position-"+position+" name ="+nameItem,Toast.LENGTH_SHORT).show()
    }


}