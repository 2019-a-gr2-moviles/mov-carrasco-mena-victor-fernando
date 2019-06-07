package com.example.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import com.example.myapplication.AdaptadorPersona
import kotlinx.android.synthetic.main.activity_parcelable.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

    val lista =    arrayListOf<Persona>();

        val recycler_view = rv_Persona;
        val actividad = this;
        lista.add(Persona("Fernando","171871553"))
        lista.add(Persona("Fernando1","171871554"))
        lista.add(Persona("Fernando2","171871553"))

        val  adaptadorPersona=AdaptadorPersona(lista, actividad, recycler_view);

        rv_Persona.adapter = adaptadorPersona
        rv_Persona.itemAnimator=DefaultItemAnimator()
        rv_Persona.layoutManager = LinearLayoutManager(this)

        adaptadorPersona.notifyDataSetChanged()
    }


}
