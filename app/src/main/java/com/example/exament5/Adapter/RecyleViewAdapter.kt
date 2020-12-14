package com.example.exament5.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exament5.Elementos.Histories
import com.example.exament5.R

class RecyleViewAdapter  : RecyclerView.Adapter<RecyleViewAdapter.ViewHolder>() {
    lateinit var histories: Array<Histories>
    lateinit var context: Context

    fun RecycleAdapter(histories: Array<Histories>, context: Context) {
        this.histories = histories
        this.context = context

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val foto = view.findViewById(R.id.imageHistory) as ImageView
        val usuario = view.findViewById(R.id.nombre_history) as TextView


        fun bind(historie:Histories, context: Context) {
            foto.setImageResource(historie.userFoto)
            usuario.text = historie.user



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.fotohorizontal, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = histories[position]
        holder.bind(item, context)

    }

    override fun getItemCount(): Int {
        return histories.size
    }

}