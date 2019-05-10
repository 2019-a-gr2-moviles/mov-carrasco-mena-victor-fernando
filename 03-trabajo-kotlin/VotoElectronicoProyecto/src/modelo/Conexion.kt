/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo


import com.mysql.jdbc.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.logging.Level
import java.util.logging.Logger

/**
 *
 * @author Primario
 */
open class Conexion {
    private val base = "bddVotacionfinal"
    private val user = "root"
    private val password = ""
    private val url = "jdbc:mysql://localhost:3306/$base"
    private var con: Connection? = null

    val conexion: Connection?
        get() {

            try {
                Class.forName("com.mysql.jdbc.Driver")
                con = DriverManager.getConnection(this.url, this.user, this.password) as Connection

            } catch (e: SQLException) {
                System.err.println(e)
            } catch (ex: ClassNotFoundException) {
                Logger.getLogger(Conexion::class.java!!.getName()).log(Level.SEVERE, null, ex)
            }

            return con
        }
}
