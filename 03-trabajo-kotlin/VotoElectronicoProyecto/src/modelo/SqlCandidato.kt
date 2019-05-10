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
import java.sql.Statement
import javax.swing.JOptionPane

/**
 *
 * @author Primario
 */
class SqlCandidato : Conexion() {
    fun registrar(can: Candidato): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion

        val sql = "insert into candidato(idCandidato,nombre_candidato,apellido_candidato,carrera_candidato,nivel_candidato,tipo_id_candidato) \n" + "values (?,?,?,?,?,?);"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, can.identificacion.toString())
            ps.setString(2, can.nombre)
            ps.setString(3, can.apellido)
            ps.setString(4, can.carrera)
            ps.setString(5, can.nivel.toString())
            ps.setString(6, can.tipo_id)
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

    fun eliminar(can: Candidato): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion

        val sql = "delete from candidato where idCandidato=?;"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, can.identificacion.toString())
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

    fun buscar(can: Candidato) {
        try {
            val con = conexion
            val pst = con.prepareStatement("select * from candidato where idCandidato = ?")
            pst.setString(1, can.identificacion.toString())

            val rs = pst.executeQuery()

            if (rs.next()) {
                can.nombre = rs.getString("nombre_candidato")
                can.apellido = rs.getString("apellido_candidato")
                can.identificacion = rs.getInt("idCandidato")
                can.tipo_id = rs.getString("tipo_id_candidato")
                can.carrera = rs.getString("carrera_candidato")
                can.nivel = rs.getInt("nivel_candidato")
            } else {
                JOptionPane.showMessageDialog(null, "Candidato no registrado!")
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
        }

    }

    fun contarCandidatos(votos: Votos): Int {
        try {
            val con = conexion
            val pst = con.createStatement()
            val rs = pst.executeQuery("select count(idCandidato) as num_candidatos from candidato;")
            if (rs.next()) {
                votos.numCandiatos = Integer.parseInt(rs.getString("num_candidatos"))
                return votos.numCandiatos
            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado candidatos")
                return 0
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
            return 0
        }

    }

    fun buscarPorNombreApellido(can: Candidato) {
        try {
            val con = conexion
            val pst = con.prepareStatement("select * from candidato where nombre_candidato = ? and apellido_candidato=?")
            pst.setString(1, can.nombre.toString())
            pst.setString(2, can.apellido.toString())

            val rs = pst.executeQuery()

            if (rs.next()) {
                can.nombre = rs.getString("nombre_candidato")
                can.apellido = rs.getString("apellido_candidato")
                can.identificacion = rs.getInt("idCandidato")
                can.tipo_id = rs.getString("tipo_id_candidato")
                can.carrera = rs.getString("carrera_candidato")
                can.nivel = rs.getInt("nivel_candidato")
            } else {
                JOptionPane.showMessageDialog(null, "Candidato no registrado!")
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
        }

    }

}
