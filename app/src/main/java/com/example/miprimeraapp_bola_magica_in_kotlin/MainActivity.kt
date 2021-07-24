package com.example.miprimeraapp_bola_magica_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    val gravedadTierra=9.8;
    val jupiter = 2.55
    val venus = 0.87
    val urano = 0.99
    val Marte = 0.38
    val Mercurio = 0.39
    val Saturno = 0.93

    var seleccio1:Int=0
    var seleccion2:Int=0
    var valorC:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val segundoSpiner: Spinner = findViewById<Spinner>(R.id.spinnerconvert)
        val listaTiposMonedas = resources.getStringArray(R.array.todasMonedas)
        val numeroUser=findViewById<EditText>(R.id.etpesoIngreso)
        val mostrarTexto =  findViewById<TextView>(R.id.tvresultado)
        val boton = findViewById<Button>(R.id.botonAdivina)




        //val listaTiposMonedas = listOf<String>("hola","Nombre","Apellido","Edad")

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaTiposMonedas)

       // primerSpiner.adapter=adaptador
        segundoSpiner.adapter=adaptador






        segundoSpiner.onItemSelectedListener=object:
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position1: Int,
                id: Long
            ) {
                 seleccio1=position1


                Toast.makeText(this@MainActivity,listaTiposMonedas[seleccio1],Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        boton.setOnClickListener(){
            valorC=devolvernumIngrsado(numeroUser) // Numero entero del usuario

            validar(seleccio1,mostrarTexto)
        }


    }

    public fun devolvernumIngrsado(a:EditText):Int{
        val num:String;
        if(a.text.toString().isEmpty()){
            a.setError("Ingresa tu peso")
            return 0
        }else{
            num=a.text.toString()
            valorC=Integer.parseInt(num)
            return valorC

        }
    }

   public fun validar(a:Int,b:TextView){
        when(a){
            0 -> {
                if (valorC != 0){
                    println("->aaa  $a")
                    print("->cc $valorC")
                    var total:Double=valorC*gravedadTierra
                    b.setText("Tu peso en La Tierra : $total newtons")
                }else{
                    b.setError("Ingrsa un valor")
                }
            };

            1 ->{
                if (valorC != 0){
                    println("->aaa  $a")
                    print("->cc $valorC")
                    var total:Double=valorC*jupiter
                    b.setText("Tu peso en Jupiter : $total newtons")
                }else{
                    b.setError("Ingrsa un valor")
                }
            };
            2 ->{
                if (valorC != 0){
                    println("->22  $a")
                    print("->cc2 $valorC")
                    var total:Double=valorC*venus
                    b.setText("Tu peso en Venus: $total newtons")
                }else{
                    b.setError("Ingrsa un valor")
                }
            };
            else ->{"Eror en When"}
            }
            }
        }

