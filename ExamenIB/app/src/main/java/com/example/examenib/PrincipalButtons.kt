package com.example.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class PrincipalButtons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_buttons)
    }

    fun irATiendas(){
        val intentExplicito = Intent(
            this,
            ManageTend::class.java
        )

        startActivity(intentExplicito)
    }
}
