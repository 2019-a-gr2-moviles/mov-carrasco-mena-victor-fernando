package com.example.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal_buttons.*

class PrincipalButtons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_buttons)

        btn_manage_tend.setOnClickListener{
            irATiendas()
        }

        btn_create_tend.setOnClickListener {
            irACrearTienda()
        }
    }

    fun irATiendas(){
        val intentExplicito = Intent(
            this,
            ListOfTends::class.java
        )

        startActivity(intentExplicito)
    }

    fun irACrearTienda(){
        val intentExplicito = Intent(
            this,
            CreateTend::class.java
        )

        startActivity(intentExplicito)
    }
}
