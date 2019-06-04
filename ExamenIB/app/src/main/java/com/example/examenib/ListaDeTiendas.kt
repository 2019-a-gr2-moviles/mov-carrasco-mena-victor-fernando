package com.example.examenib

import android.util.Log
import java.util.*
import kotlin.collections.ArrayList

class ListaDeTiendas() {

    companion object{
        val listaTiendas:ArrayList<Tienda> = ArrayList()

        fun agregarTienda(tienda:Tienda):ArrayList<Tienda>{
            listaTiendas.add(tienda)
            return listaTiendas
        }

        fun mostrarTiendas():List<Tienda>{
            Log.i("tiendas","${listaTiendas}")
            return listaTiendas
        }
    }
}