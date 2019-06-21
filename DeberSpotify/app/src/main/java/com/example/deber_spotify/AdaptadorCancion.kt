package com.example.deber_spotify

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class AdaptadorCancion(
    private val listacanciones: List<Cancion>,
    private val contexto: MainActivity,
    private val recyclerView: RecyclerView
):RecyclerView.Adapter<AdaptadorCancion.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)
}