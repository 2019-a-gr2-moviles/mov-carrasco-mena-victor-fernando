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
class Candidato : Estudiante() {

    override fun setNivel(nivel: Int) {
        super.setNivel(nivel) //To change body of generated methods, choose Tools | Templates.
    }

    override fun setCarrera(carrera: String) {
        super.setCarrera(carrera) //To change body of generated methods, choose Tools | Templates.
    }

    override fun setTipo_id(tipo_id: String) {
        super.setTipo_id(tipo_id) //To change body of generated methods, choose Tools | Templates.
    }

    override fun setApellido(apellido: String) {
        super.setApellido(apellido) //To change body of generated methods, choose Tools | Templates.
    }

    override fun setNombre(nombre: String) {
        super.setNombre(nombre) //To change body of generated methods, choose Tools | Templates.
    }

    override fun setIdentificacion(identificacion: Int) {
        super.setIdentificacion(identificacion) //To change body of generated methods, choose Tools | Templates.
    }

    override fun getNivel(): Int {
        return super.getNivel() //To change body of generated methods, choose Tools | Templates.
    }

    override fun getCarrera(): String? {
        return super.getCarrera() //To change body of generated methods, choose Tools | Templates.
    }

    override fun getTipo_id(): String? {
        return super.getTipo_id() //To change body of generated methods, choose Tools | Templates.
    }

    override fun getApellido(): String? {
        return super.getApellido() //To change body of generated methods, choose Tools | Templates.
    }

    override fun getNombre(): String? {
        return super.getNombre() //To change body of generated methods, choose Tools | Templates.
    }

    override fun getIdentificacion(): Int {
        return super.getIdentificacion() //To change body of generated methods, choose Tools | Templates.
    }

}
