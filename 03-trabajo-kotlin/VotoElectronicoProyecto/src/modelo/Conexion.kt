/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo


import com.mysql.jdbc.Connection

import java.io.File
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




}
