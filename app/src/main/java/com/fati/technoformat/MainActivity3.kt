package com.fati.technoformat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val arrayAdapter: ArrayAdapter<String>
        val users= arrayOf("fadhma","chayma","silya","thiziri","asma","yamina")
        var mListView=findViewById<ListView>(R.id.userlist)
        arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,users)
        mListView.adapter=arrayAdapter
    }
}