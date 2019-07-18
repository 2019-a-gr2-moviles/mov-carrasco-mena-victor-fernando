package com.example.miapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_primer_fragment.*

class PrimerFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_fragment)

        btn_primero.setOnClickListener {
            abrirPrimerFragmento()
        }
    }

    fun abrirPrimerFragmento(){
        // 1) manager
        val fragmentManager = supportFragmentManager
        // 2) Empezar la transaccion
        val transaccion = fragmentManager.beginTransaction()
        // 3) Ddfinir la instancia del fragmento
        val primerFragmento = PrimerFragment()
        // 4) Reemplazamos el fragmento
        transaccion.replace(R.id.constraint_fragmento,primerFragmento)
        // 5) terminar la transaccion
        transaccion.commit()
    }

    fun abrirSegundoFragmento(){
        // 1) manager
        val fragmentManager = supportFragmentManager
        // 2) Empezar la transaccion
        val transaccion = fragmentManager.beginTransaction()
        // 3) Ddfinir la instancia del fragmento
        val primerFragmento = PrimerFragment()
        // 4) Reemplazamos el fragmento
        transaccion.replace(R.id.constraint_fragmento,primerFragmento)
        // 5) terminar la transaccion
        transaccion.commit()
    }
}
