package org.iesmurgi.formularioautocompletetextview

data class Persona(val nombre:String,val edad:Int, val altura:Double){

    companion object {
        val nombreSource= listOf<Persona>(
            Persona("David",20,1.88),
            Persona("Diego",30,2.33),
            Persona("Daniel",40,1.66),
            Persona("Dionisio",50,1.22)
        )
    }

    override fun toString():String{
        return nombre
    }


}
