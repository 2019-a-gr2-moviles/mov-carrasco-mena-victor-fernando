package com.example.examenib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ListOfTends : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_tends)

        val tienda1 = this.intent.
                getParcelableExtra<Tienda>("tienda")
        val listaDeTiendas = arrayListOf<Tienda>()
        listaDeTiendas.add(tienda1)
    }
}
