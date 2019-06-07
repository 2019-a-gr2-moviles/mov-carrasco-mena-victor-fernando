package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.miapp.Persona
import com.example.miapp.R
import com.example.miapp.RecyclerViewActivity
import org.w3c.dom.Text
import java.text.FieldPosition

class AdaptadorPersona(
    private val listaPersonas: List<Persona>,
    private val contexto: RecyclerViewActivity,
    private val recyclerView: RecyclerView
):RecyclerView.Adapter<AdaptadorPersona.MyViewHolder>() {
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var nombreTextView: TextView
        var cedulaTextView: TextView
        var accionBoton: Button

        init {
            nombreTextView = view.findViewById(R.id.txt_nombre) as TextView
            cedulaTextView = view.findViewById(R.id.txt_cedula) as TextView
            accionBoton = view.findViewById(R.id.btn_accion) as Button

            val layout = view.findViewById(R.id.linear_layout_v) as LinearLayout

            layout
                .setOnClickListener{

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





