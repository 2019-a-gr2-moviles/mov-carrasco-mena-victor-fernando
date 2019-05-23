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

        Log.i("pacelable","Nombre ${adrian?.nombre}")
        Log.i("pacelable","Nombre ${adrian?.edad}")
        Log.i("pacelable","Nombre ${adrian?.fechaNacimiento}")
        Log.i("pacelable","Nombre ${adrian?.sueldo}")
    }

    fun regresarMenu(){
        val intentExplicito = Intent(
            this,
            MainActivity::class.java
        )
        startActivity(intentExplicito)
    }

}
