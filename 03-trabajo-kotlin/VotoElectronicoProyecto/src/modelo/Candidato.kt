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

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var nivel: Int
        get() = super.nivel
        set(nivel) {
            super.nivel = nivel
        }

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var carrera: String?
        get() = super.carrera
        set(carrera) {
            super.carrera = carrera
        }

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var tipo_id: String?
        get() = super.tipo_id
        set(tipo_id) {
            super.tipo_id = tipo_id
        }

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var apellido: String?
        get() = super.apellido
        set(apellido) {
            super.apellido = apellido
        }

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var nombre: String?
        get() = super.nombre
        set(nombre) {
            super.nombre = nombre
        }

    override//To change body of generated methods, choose Tools | Templates.
    //To change body of generated methods, choose Tools | Templates.
    var identificacion: Int
        get() = super.identificacion
        set(identificacion) {
            super.identificacion = identificacion
        }

}
