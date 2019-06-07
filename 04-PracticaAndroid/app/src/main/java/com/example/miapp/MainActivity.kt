package com.example.miapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_parcelable.setOnClickListener{
            irAParcelable()
        }

        btn_reciclerView.setOnClickListener(
            irActividad();
        )
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
    fun irActividad(){
        val intent = Intent(this,RecyclerViewActivity::class.java);
        
    }
}
