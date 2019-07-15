package com.example.miapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listaNombres = arrayListOf<String>()
        listaNombres.add("Fernando")
        listaNombres.add("Carlos")
        listaNombres.add("Victor")
        listaNombres.add("SAntiago")
        listaNombres.add("Adrian")

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaNombres)

        lv_ejemplo.adapter = adapter

        lv_ejemplo.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->
            Log.i("list-view","Posicion $position")
        }


    }

}
