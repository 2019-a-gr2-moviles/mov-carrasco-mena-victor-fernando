package com.example.miapp

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPersona(
    private val listaPersonas: List<Persona>,
    private val contexto: RecyclerViewActivity,
    private val recyclerView: androidx.recyclerview.widget.RecyclerView
):androidx.recyclerview.widget.RecyclerView.Adapter<AdaptadorPersona.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

        var nombreTextView: TextView
        var cedulaTextView: TextView
        var accionBoton: Button

        init {
            nombreTextView = view.findViewById(R.id.txt_nombre) as TextView
            cedulaTextView = view.findViewById(R.id.txt_cedula) as TextView
            accionBoton = view.findViewById(R.id.btn_accion) as Button

            val layout = view.findViewById(R.id.linear_layout) as LinearLayout

            layout
                .setOnClickListener {

                    Log.i("recycler-view", "Layout presionado")

                }

            accionBoton.setOnClickListener {
                nombreTextView.text = "ME CAMBIAROOOOOOON!!! "

                contexto.cambiarNombreTextView("WOW!")

                val nuevasPersonas = arrayListOf<Persona>()

                nuevasPersonas.add(Persona("Felipe", "1091231239"))
                nuevasPersonas.add(Persona("Rafael", "0192929273"))
                nuevasPersonas.add(Persona("Nydia", "18293041822"))

                contexto.iniciarRecylerView(nuevasPersonas, contexto, recyclerView)

                nuevasPersonas.add(Persona("Felipe",""))
                nuevasPersonas.add(Persona("Rafael", "0192929273"))
                nuevasPersonas.add(Persona("Nydia", "18293041822"))

                contexto.iniciarRecylerView(nuevasPersonas, contexto, recyclerView)
            }
        }
    }
    //Devuelve el numero de items
    override fun getItemCount(): Int {
        return listaPersonas.size
    }

    override fun onBindViewHolder(myViewHolder: AdaptadorPersona.MyViewHolder,
                                  position: Int) {
        val persona = listaPersonas.get(position)
        myViewHolder.nombreTextView.text = persona.nombre
        myViewHolder.cedulaTextView.text = persona.cedula
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int):
            AdaptadorPersona.MyViewHolder {
        val itemView = LayoutInflater
            .from(p0.context)
            .inflate(
                R.layout.layout,
                p0,
                false
            )

        return MyViewHolder(itemView)
    }


}





