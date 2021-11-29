package org.iesmurgi.formularioautocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     lateinit var autocompletetextviewNombre:AutoCompleteTextView
     lateinit var textviewEdad:TextView
    lateinit var textviewAltura:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        autocompletetextviewNombre=findViewById<AutoCompleteTextView
                >(R.id.autocompletetextviewNombre)
        textviewEdad=findViewById<TextView>(R.id.textviewEdad)
        textviewAltura=findViewById<TextView>(R.id.textviewAltura)



        setOpcionArrays()
        setOpcionList()
    }



    //No rellena los sub-campos
    private fun setOpcionArrays(){
        val nombres=resources.getStringArray(R.array.nombres)
        ArrayAdapter(this,android.R.layout.simple_list_item_1,nombres).also { adapter -> autocompletetextviewNombre.setAdapter(adapter)  }
    }


    //funciona
    private fun setOpcionList(){
        PersonaAdapter(this,Persona.nombreSource).also { adapter ->
            autocompletetextviewNombre.setAdapter(adapter)
        }
        autocompletetextviewNombre.setOnItemClickListener { parent,_, position, _ ->
            val persona=parent.adapter.getItem(position) as Persona
            textviewEdad.text=persona.edad.toString()
            textviewAltura.text=persona.altura.toString()
        }
    }


}