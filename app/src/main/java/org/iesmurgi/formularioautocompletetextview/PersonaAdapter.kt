package org.iesmurgi.formularioautocompletetextview

import org.iesmurgi.formularioautocompletetextview.MainActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import org.iesmurgi.formularioautocompletetextview.Persona
import org.w3c.dom.Text

class PersonaAdapter (context: Context,zonas:List<Persona>): ArrayAdapter<Persona>(context,0,zonas) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        //return super.getView(position, convertView, parent)
        val vista = convertView ?:
        LayoutInflater.from(context).inflate(R.layout.esqueleto_personas,parent,false)
            getItem(position)?.let {
                persona ->
                vista.findViewById<TextView>(R.id.textviewEdad).apply {

                   text=persona.nombre

                }
            }

        return vista
    }



}