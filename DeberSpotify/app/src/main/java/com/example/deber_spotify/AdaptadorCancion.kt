package com.example.deber_spotify

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AdaptadorCancion(
    private val listaCanciones: List<Cancion>,
    private val contexto: MainActivity,
    private val recyclerView: RecyclerView
):RecyclerView.Adapter<AdaptadorCancion.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view), Parcelable {
        var generoView: TextView

        init {

        }

    }

    override fun getItemCount(): Int {
        return listaCanciones.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}