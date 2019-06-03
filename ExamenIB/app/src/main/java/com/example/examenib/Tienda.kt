package com.example.examenib

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class Tienda (
            var nombre:String,
            var direccion:String,
            var fechaApertura:Date,
            var ruc:Int,
            var matriz:Boolean):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readSerializable() as Date,
        parcel.readInt(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(direccion)
        parcel.writeSerializable(fechaApertura)
        parcel.writeInt(ruc)
        parcel.writeByte(if (matriz) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tienda> {
        override fun createFromParcel(parcel: Parcel): Tienda {
            return Tienda(parcel)
        }

        override fun newArray(size: Int): Array<Tienda?> {
            return arrayOfNulls(size)
        }
    }

}