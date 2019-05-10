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
class SqlVotos : Conexion() {
    fun registrar(votos: Votos): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion
        val sql = "insert into votos(idVotos,voto,Candidato_idCandidato,en_blanco) values (?,?,?,?);"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, votos.idVotos.toString())
            ps.setString(2, votos.voto.toString())
            ps.setString(3, votos.idCandidato.toString())
            ps.setString(4, votos.blanco.toString())
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

    fun votosTotales(votos: Votos): Int {
        try {
            val con = conexion
            val pst = con.createStatement()
            val rs = pst.executeQuery("select count(voto) as num_votos from votos where voto = 1 ;")
            if (rs.next()) {
                votos.numVotantes = Integer.parseInt(rs.getString("num_votos"))
                return votos.numVotantes
            } else {
                JOptionPane.showMessageDialog(null, "No se han registrado votos")
                return 0
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
            return 0
        }

    }

    fun votosEnBlanco(votos: Votos): Int {
        try {
            val con = conexion
            val pst = con.createStatement()
            val rs = pst.executeQuery("select count(en_blanco) as num_blancos from votos where en_blanco = 1 ;")
            if (rs.next()) {
                votos.numBlancos = Integer.parseInt(rs.getString("num_blancos"))
                return votos.numBlancos
            } else {
                JOptionPane.showMessageDialog(null, "No se han registrado votos en blanco")
                return 0
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
            return 0
        }

    }

    fun contarVotosCandidato(votos: Votos): Int {
        try {
            val con = conexion
            val pst = con.prepareStatement("select count(*) as votos from votos where Candidato_idCandidato=? and voto = 1;")
            pst.setString(1, votos.idCandidato.toString())

            val rs = pst.executeQuery()

            if (rs.next()) {
                votos.numVotantes = rs.getInt("votos")
                return votos.numVotantes

            } else {
                JOptionPane.showMessageDialog(null, "No existen registros de votos")
                return 0
            }

        } catch (e: Exception) {
            JOptionPane.showMessageDialog(null, e.toString())
            return 0
        }

    }
}
