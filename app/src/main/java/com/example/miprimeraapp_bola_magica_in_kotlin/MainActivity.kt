package com.example.miprimeraapp_bola_magica_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val primerSpiner: Spinner = findViewById(R.id.spinner)
        val segundoSpiner: Spinner = findViewById<Spinner>(R.id.spinnerconvert)
        val listaTiposMonedas = resources.getStringArray(R.array.todasMonedas)

        //val listaTiposMonedas = listOf<String>("hola","Nombre","Apellido","Edad")

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaTiposMonedas)

        primerSpiner.adapter=adaptador
        segundoSpiner.adapter=adaptador


        primerSpiner.onItemSelectedListener=object:
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,listaTiposMonedas[position],Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }



    }
}