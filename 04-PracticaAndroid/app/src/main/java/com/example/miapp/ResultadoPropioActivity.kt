package com.example.miapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResultadoPropioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_propio)
    }

    fun devolverRespuesta(){
        val nombre = "Adrian"
        val edad = 30

        val intentRespuesta = Intent()

        intentRespuesta.putExtra("nombreUsuario",nombre)
        intentRespuesta.putExtra("edadUsuario",edad)

        this.setResult(
            RESULT_OK, // Podemos enviar RESULT_OK o RESULT_CANCELED
            intentRespuesta
        )

        this.finish()
    }
}
