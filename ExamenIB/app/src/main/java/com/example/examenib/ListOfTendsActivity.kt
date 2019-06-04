package com.example.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_of_tends.*

class ListOfTendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_tends)

        val arregloTiendas = ListaDeTiendas.listaTiendas
        //ListaDeTiendas.mostrarTiendas()
        val adapter = ArrayAdapter<Tienda>(
            this,
            android.R.layout.simple_list_item_1,
            ListaDeTiendas.mostrarTiendas()
        )

        lv_tends.adapter = adapter;
        lv_tends.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val tienda = arregloTiendas[position]
            enviar_tienda(tienda,position)
            Log.i("parcelable","Nombre ${tienda.nombre}")
        }


    }

    fun enviar_tienda(tienda: Tienda,pos:Int){
        val intentActividadIntent = Intent(
            this,
            ManageTendActivity::class.java
        )
        intentActividadIntent.putExtra("tienda",tienda)
        intentActividadIntent.putExtra("pos",pos)
        startActivity(intentActividadIntent)
    }
}
