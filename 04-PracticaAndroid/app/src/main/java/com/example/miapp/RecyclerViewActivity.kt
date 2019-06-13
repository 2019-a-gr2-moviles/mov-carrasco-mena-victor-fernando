package com.example.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.myapplication.AdaptadorPersona
import kotlinx.android.synthetic.main.activity_parcelable.*
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val lista =    arrayListOf<Persona>();
        //val recycler_view = rv_Persona;
        //val actividad = this;

        lista.add(Persona("Fernando","171871553"))
        lista.add(Persona("Fernando1","171871554"))
        lista.add(Persona("Fernando2","171871553"))

        iniciarRecylerView(lista, this, rv_Persona)

    }

    fun iniciarRecylerView(
        lista: List<Persona>,
        actividad: RecyclerViewActivity,
        recycler_view: RecyclerView
    ) {
        val adaptadorPersona = AdaptadorPersona(
            lista,
            actividad,
            recycler_view
        )
        recycler_view.adapter = adaptadorPersona
        recycler_view.itemAnimator = DefaultItemAnimator()
        recycler_view.layoutManager = LinearLayoutManager(actividad)

        adaptadorPersona.notifyDataSetChanged()
    }

    fun cambiarNombreTextView(texto: String) {
        txt_titulo_rv.text = texto
    }

}
