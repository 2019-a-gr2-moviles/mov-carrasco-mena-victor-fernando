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
class SqlUsuarios : Conexion() {
    fun registrar(usr: Usuarios): Boolean {
        var ps: PreparedStatement? = null
        val con = conexion

        val sql = "INSERT INTO usuarios (usuario, password) VALUES(?,?)"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, usr.usuario)
            ps.setString(2, usr.password)
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

    fun loginAdmin(usr: Usuarios): Boolean {
        var ps: PreparedStatement? = null
        var rs: ResultSet? = null
        val con = conexion

        val sql = "SELECT idAdministrador, usuario, contrasenya FROM administrador WHERE usuario = ? LIMIT 1"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, usr.usuario)
            rs = ps.executeQuery()

            if (rs!!.next()) {
                if (usr.password == rs.getString(3)) {
                    usr.id = rs.getInt(1)
                    return true
                } else {
                    return false
                }
            }

            return false
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

    fun loginVotante(usr: Usuarios): Boolean {
        var ps: PreparedStatement? = null
        var rs: ResultSet? = null
        val con = conexion

        val sql = "SELECT idVotante, Usuario, contraseña FROM votante WHERE usuario = ? LIMIT 1"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, usr.usuario)
            rs = ps.executeQuery()

            if (rs!!.next()) {
                if (usr.password == rs.getString(3)) {
                    usr.id = rs.getInt(1)
                    return true
                } else {
                    return false
                }
            }

            return false
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

    fun existeUsuario(usuario: String): Int {
        var ps: PreparedStatement? = null
        var rs: ResultSet? = null
        val con = conexion

        val sql = "SELECT count(idAdministrador) FROM Administrador WHERE usuario = ?"

        try {
            ps = con.prepareStatement(sql)
            ps!!.setString(1, usuario)
            rs = ps.executeQuery()

            return if (rs!!.next()) {
                rs.getInt(1)
            } else 1

        } catch (e: SQLException) {
            JOptionPane.showMessageDialog(null, e.toString())
            return 1
        } finally {
            try {
                con.close()
            } catch (e: SQLException) {
                JOptionPane.showMessageDialog(null, e.toString())
            }

        }
    }
}
