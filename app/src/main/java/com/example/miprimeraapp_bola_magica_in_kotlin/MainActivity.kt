package com.example.miprimeraapp_bola_magica_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val listaTiposMonedas = resources.getStringArray(R.array.todasMonedas)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var primerSpiner: Spinner = findViewById(R.id.spinner)
        var segundoSpiner: Spinner = findViewById(R.id.spinnerconvert)

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaTiposMonedas)

        primerSpiner.adapter=adaptador
        segundoSpiner.adapter=adaptador

        primerSpiner.onItemClickListener=object:
        AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,listaTiposMonedas[position],Toast.LENGTH_LONG).show()
            }

        }
        segundoSpiner.onItemClickListener=object:
            AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                TODO("Not yet implemented")
            }

        }


    }
}