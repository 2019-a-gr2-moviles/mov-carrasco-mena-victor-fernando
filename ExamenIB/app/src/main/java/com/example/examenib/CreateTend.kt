package com.example.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_tend.*
import kotlinx.android.synthetic.main.activity_create_tend.txt_address
import kotlinx.android.synthetic.main.activity_create_tend.txt_nombre
import kotlinx.android.synthetic.main.activity_manage_tend.*
import java.util.*
import java.util.regex.Pattern

class CreateTend : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_tend)

        btn_save_tend.setOnClickListener {
            guardarTienda()
        }
    }

    fun guardarTienda(){
        val intentExplicito = Intent(
            this,
            ListOfTends::class.java
        )

        val nombre = txt_nombre.text.toString()
        var direccion = txt_address.text.toString()
        /*var patron = Pattern.compile("^(19|20)\\d{2}[\\/](0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])$")
        var fecha = txt_openning_date.text.toString().
            split(
                regex = patron,
                limit = 3)
        var year = Integer.parseInt(fecha.get(0))
        var month = Integer.parseInt(fecha.get(1))
        var day = Integer.parseInt(fecha.get(2))*/
        var fechaApertura = Date()
        var ruc = Integer.parseInt(txt_ruc.text.toString())
        var matriz = false
        if (rb_matriz.isChecked)
            matriz = true

        val tienda = Tienda(nombre,direccion,fechaApertura,ruc,matriz)

        intentExplicito.putExtra("tienda",tienda)


    }


}
