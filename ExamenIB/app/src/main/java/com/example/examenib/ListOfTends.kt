package com.example.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_of_tends.*

class ListOfTends : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_tends)

        val tienda1:Tienda? = this.intent.
                getParcelableExtra<Tienda>("tienda")
        val listaDeTiendas = arrayListOf<Tienda?>()
        listaDeTiendas.add(tienda1)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            listaDeTiendas)

        lv_tends.adapter = adapter
    }
}
