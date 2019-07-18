package com.example.miapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ciclo_vida.*

class CicloVidaActivity : AppCompatActivity() {

    var contador = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        btn_contador.setOnClickListener {
            aumentarContador()
        }
    }

    fun aumentarContador(){
        contador++;
        tv_contador.text = contador.toString()
        Log.i("contador","")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo-vida","on create")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo-vida","on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo-vida","on pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo-vida","on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo-vida","on destroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo-vida","on stop")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.i("ciclo-vida","onSaveInstanceState")

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("ciclo-vida","onSaveInstanceState")
    }
}
