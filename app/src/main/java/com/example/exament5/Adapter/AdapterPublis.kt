package com.example.exament5.Adapter

import android.app.Activity
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.exament5.Elementos.Histories
import com.example.exament5.Elementos.Publicacion
import com.example.exament5.R
import org.w3c.dom.Text

class AdapterPublis(
    private val context: Activity,
    private val publis: Array<Publicacion>
) : ArrayAdapter<Publicacion>(context, R.layout.fragment_vertical, publis) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val cardView = inflater.inflate(R.layout.fotovertical, null, true)

        var fotoUser: ImageView = cardView.findViewById(R.id.imagePubli) as ImageView
        var nombrePubli: TextView = cardView.findViewById(R.id.nombre_publi) as TextView
        var descripcion: TextView = cardView.findViewById(R.id.descripcionPubli) as TextView
        var megustas: TextView = cardView.findViewById(R.id.numMegusta) as TextView
        var imagen: ImageView = cardView.findViewById(R.id.imageView2) as ImageView



        imagen.setImageResource(publis[position].foto)
        nombrePubli.text = publis[position].user
        fotoUser.setImageResource(publis[position].userFoto)
        descripcion.text = publis[position].user + " " + publis[position].descripcion
        megustas.text = publis[position].megustas.toString()


        return cardView
    }

}