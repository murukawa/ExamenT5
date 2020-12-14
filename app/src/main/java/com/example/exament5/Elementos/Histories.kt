package com.example.exament5.Elementos

import com.example.exament5.R
import java.io.Serializable

class Histories (val user: String,
    val userFoto: Int): Serializable {companion object{

    public fun historias(): Array<Histories> {
        return arrayOf(
            Histories("informatica", R.drawable.kotlin),
            Histories("informatica", R.drawable.kotlin),
            Histories("informatica", R.drawable.kotlin),
            Histories("informatica", R.drawable.kotlin),
            Histories("informatica", R.drawable.kotlin)
        )
    }
}}