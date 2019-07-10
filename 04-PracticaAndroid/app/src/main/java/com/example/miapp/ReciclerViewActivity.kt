package com.example.miapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_parcelable.*
import kotlinx.android.synthetic.main.activity_recycler_view.*

class ReciclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val lista =    arrayListOf<Persona>();
        //val recycler_view = rv_Persona;
        //val actividad = this;

        lista.add(Persona("Fernando","171871553"))
        lista.add(Persona("Victor","171871554"))
        lista.add(Persona("Vanessa","171871553"))

        iniciarRecylerView(lista, this, rv_personas)

    }

    fun iniciarRecylerView(
        lista: List<Persona>,
        actividad: ReciclerViewActivity,
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


        
    }
    fun cambiarNombreTextView(texto: String) {
        txv_titulo_rv.text = texto
    }
}
