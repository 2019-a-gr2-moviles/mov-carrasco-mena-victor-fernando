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
class Votante : Estudiante() {


    fun setNivel(nivel: Int) {
        super.nivel = nivel //To change body of generated methods, choose Tools | Templates.
    }

    fun setCarrera(carrera: String) {
        super.carrera = carrera //To change body of generated methods, choose Tools | Templates.
    }

    fun setTipo_id(tipo_id: String) {
        super.tipo_id = tipo_id //To change body of generated methods, choose Tools | Templates.
    }

    fun setApellido(apellido: String) {
        super.apellido = apellido //To change body of generated methods, choose Tools | Templates.
    }

    fun setNombre(nombre: String) {
        super.nombre = nombre //To change body of generated methods, choose Tools | Templates.
    }

    fun setIdentificacion(identificacion: Int) {
        super.identificacion = identificacion //To change body of generated methods, choose Tools | Templates.
    }

    fun getNivel(): Int {
        return super.nivel //To change body of generated methods, choose Tools | Templates.
    }

    fun getCarrera(): String {
        return super.carrera //To change body of generated methods, choose Tools | Templates.
    }

    fun getTipo_id(): String {
        return super.tipo_id //To change body of generated methods, choose Tools | Templates.
    }

    fun getApellido(): String {
        return super.apellido //To change body of generated methods, choose Tools | Templates.
    }

    fun getNombre(): String {
        return super.nombre //To change body of generated methods, choose Tools | Templates.
    }

    fun getIdentificacion(): Int {
        return super.identificacion //To change body of generated methods, choose Tools | Templates.
    }

}
