/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import javax.swing.JOptionPane

/**
 *
 * @author Primario
 */
class SqlVotante : Conexion() {
    fun registrar(vot: Votante): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion

        val sql = "insert into votante(idVotante,nombre_votante,apellido_votante,tipo_id,carrera_votante,nivel_votante,Usuario,contraseña) \n" + "values (?,?,?,?,?,?,?,?);"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, vot.identificacion.toString())
            ps.setString(2, vot.nombre)
            ps.setString(3, vot.apellido)
            ps.setString(4, vot.tipo_id)
            ps.setString(5, vot.carrera)
            ps.setString(6, vot.nivel.toString())
            ps.setString(7, vot.nombre + " " + vot.apellido)
            ps.setString(8, vot.identificacion.toString())
            ps.execute()
            return true
        } catch (e: SQLException) {
            JOptionPane.showMessageDialog(null, e.toString())
            return false
        } finally {
            try {
                con.close()
            } catch (e: SQLException) {
                JOptionPane.showMessageDialog(null, e.toString())
            }

        }
    }

    fun eliminar(vot: Votante): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion

        val sql = "delete * from votante where idVotante=?;"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, vot.identificacion.toString())
            ps.execute()
            return true
        } catch (e: SQLException) {
            JOptionPane.showMessageDialog(null, e.toString())
            return false
        } finally {
            try {
                con.close()
            } catch (e: SQLException) {
                JOptionPane.showMessageDialog(null, e.toString())
            }

        }
    }

    fun buscar(vot: Votante) {
        try {
            val con = conexion
            val pst = con.prepareStatement("select * from votante where idVotante = ?")
            pst.setString(1, vot.identificacion.toString())

            val rs = pst.executeQuery()

            if (rs.next()) {
                vot.nombre = rs.getString("nombre_votante")
                vot.apellido = rs.getString("apellido_votante")
                vot.identificacion = rs.getInt("idVotante")
                vot.tipo_id = rs.getString("tipo_id")
                vot.carrera = rs.getString("carrera_votante")
                vot.nivel = rs.getInt("nivel_votante")
            } else {
                JOptionPane.showMessageDialog(null, "Votante no registrado!")
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
        }

    }

}
