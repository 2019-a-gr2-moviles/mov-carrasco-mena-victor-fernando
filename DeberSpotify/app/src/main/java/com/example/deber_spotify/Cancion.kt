package com.example.deber_spotify

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Cancion(
    titulo:String,
    genero:String,
    artista:String,
    duracion:String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cancion> {
        override fun createFromParcel(parcel: Parcel): Cancion {
            return Cancion(parcel)
        }

        override fun newArray(size: Int): Array<Cancion?> {
            return arrayOfNulls(size)
        }
    }

}