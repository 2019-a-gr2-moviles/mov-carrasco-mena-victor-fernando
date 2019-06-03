package com.example.examenib

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_enter.setOnClickListener{
            irABotonesPrincipales()
        }


    }

    fun irABotonesPrincipales(){
        val intentExplicito = Intent(
            this,
            PrincipalButtons::class.java
        )
        val fernando = Usuario("Fernando Carrasco")
        intentExplicito.putExtra("usuario",fernando)
        if(fernando.nombre == txt_name.text.toString()){
            startActivity(intentExplicito)
        }else{
        Log.i("error","nombre incorrecto")
        }


    }
}
