package com.example.miapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_parcelable.setOnClickListener{
            irAParcelable()
        }

        btn_toast.setOnClickListener {
            irAToast()
        }
        btn_adapter.setOnClickListener {
            irAListView()
        }
        btn_http.setOnClickListener{
            irAHttp()
        }

        btn_mapa.setOnClickListener {
            irAMapa()
        }

        btn_ciclo_vida.setOnClickListener{
            irACicloVida()
        }

        btn_fragmentos.setOnClickListener {
            irAFragmentos()
        }
    }

    fun irAMapa(){
        val intentExplicito = Intent(
            this,
            MapsActivity::class.java
        )
        startActivity(intentExplicito)
    }

    fun irAHttp(){
        val intentExplicito = Intent(
            this,ConexionHttpActivity::class.java
        )
        startActivity(intentExplicito)
    }
    fun irAParcelable(){
        val intentExplicito = Intent(
            this,
            Parcelable::class.java
        )
        val adrian = Usuario("Adrian",
            29,
            Date(),
            12.12)
        intentExplicito.putExtra("usuario",adrian)

        val cachetes = Mascota("Adrian",adrian)
        intentExplicito.putExtra("mascota",cachetes)

        startActivity(intentExplicito)
    }


    fun irAToast(){
        val intentExplicito = Intent(
            this,
            Main2Activity::class.java
        )
        startActivity(intentExplicito)
    }

    fun irAListView(){
        val intentExplicito = Intent(
            this,
            ListViewActivity::class.java
        )
        startActivity(intentExplicito)
    }

    fun irACicloVida(){
        val intentExplicito = Intent(
            this,
            CicloVidaActivity::class.java
        )
        startActivity(intentExplicito)
    }

    fun irAFragmentos(){
        val intentExplicito = Intent(
            this,
            PrimerFragmentActivity::class.java
        )
        startActivity(intentExplicito)
    }
}
