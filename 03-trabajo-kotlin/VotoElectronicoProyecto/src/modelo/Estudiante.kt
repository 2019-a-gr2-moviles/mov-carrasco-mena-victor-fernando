/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo

/**
 *
 * @author Primario
 */
open class Estudiante {
    private var identificacion: Int = 0
    private var nombre: String = ""
    private var apellido: String = ""
    private var tipo_id: String = ""
    private var carrera: String = ""
    private var nivel: Int = 0

    open fun getIdentificacion(): Int {
        return identificacion
    }

    open fun getNombre(): String? {
        return nombre
    }

    open fun getApellido(): String? {
        return apellido
    }

    open fun getTipo_id(): String? {
        return tipo_id
    }

    open fun getCarrera(): String? {
        return carrera
    }

    open fun getNivel(): Int {
        return nivel
    }

    open fun setIdentificacion(identificacion: Int) {
        this.identificacion = identificacion
    }

    open fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    open fun setApellido(apellido: String) {
        this.apellido = apellido
    }

    open fun setTipo_id(tipo_id: String) {
        this.tipo_id = tipo_id
    }

    open fun setCarrera(carrera: String) {
        this.carrera = carrera
    }

    open fun setNivel(nivel: Int) {
        this.nivel = nivel
    }


}
