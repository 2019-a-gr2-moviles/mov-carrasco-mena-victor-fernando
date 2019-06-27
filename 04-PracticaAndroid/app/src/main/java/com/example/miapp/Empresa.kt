package com.example.miapp

import java.util.*

class Empresa (
    var id:Int,
    var nombre:String,
    var createdAt:Long,
    var updatedAt: Long
){
    var fechaCreacion: Date
    var fechaActualizacion: Date

    init {
        fechaCreacion = Date(createdAt)
        fechaActualizacion = Date(updatedAt)
    }
}