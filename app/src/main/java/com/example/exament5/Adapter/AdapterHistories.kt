package com.example.exament5.Adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.exament5.Elementos.Histories
import com.example.exament5.R

class AdapterHistories(
private val context: Activity,
private val histories: Array<Histories>
) : ArrayAdapter<Histories>(context, R.layout.fragment_horizontal, histories) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val cardView = inflater.inflate(R.layout.fotohorizontal, null, true)

        var foto: ImageView = cardView.findViewById(R.id.vistaHistory)as ImageView
        var titulo: TextView = cardView.findViewById(R.id.nombre_history) as TextView


        titulo.text = histories[position].user
        foto.setImageResource(histories[position].userFoto)




        return cardView
    }

}