package com.example.miapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class Parcelable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val adrian = this.intent.
            getParcelableExtra<Usuario>("usuario")

        val cachetes:Mascota = this.intent.
            getParcelableExtra<Mascota>("usuario")

        Log.i("pacelable","Nombre ${adrian?.nombre}")
        Log.i("pacelable","Nombre ${adrian?.edad}")
        Log.i("pacelable","Nombre ${adrian?.fechaNacimiento}")
        Log.i("pacelable","Nombre ${adrian?.sueldo}")

        Log.i("pacelable","Nombre ${cachetes?.nombre}")
        Log.i("pacelable","Nombre ${cachetes?.duenio}")

    }

    fun regresarMenu(){
        val intentExplicito = Intent(
            this,
            MainActivity::class.java
        )
        startActivity(intentExplicito)
    }

}
