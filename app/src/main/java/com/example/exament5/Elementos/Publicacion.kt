package com.example.exament5.Elementos

import com.example.exament5.R
import java.io.Serializable

class Publicacion(
val user: String,
val descripcion: String,
val foto: Int,
val userFoto: Int,
val megustas:Int,
):Serializable  {companion object{
    public fun publicaciones():Array<Publicacion>{
        return arrayOf(
            Publicacion("consulta_informatica","te ha pasado que quieres comprar una maquina pero no sabes cual elegir???",R.drawable.kotlin,
                R.drawable.kotlin,25),
            Publicacion("consulta_informatica","te ha pasado que quieres comprar una maquina pero no sabes cual elegir???",R.drawable.kotlin,
                R.drawable.kotlin,25),
            Publicacion("consulta_informatica","te ha pasado que quieres comprar una maquina pero no sabes cual elegir???",R.drawable.kotlin,
                R.drawable.kotlin,25),
            Publicacion("consulta_informatica","te ha pasado que quieres comprar una maquina pero no sabes cual elegir???",R.drawable.kotlin,
                R.drawable.kotlin,25),)
    }
}}