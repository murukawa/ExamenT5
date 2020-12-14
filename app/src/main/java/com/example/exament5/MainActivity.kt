package com.example.exament5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exament5.Adapter.AdapterPublis
import com.example.exament5.Adapter.RecyleViewAdapter
import com.example.exament5.Elementos.Histories
import com.example.exament5.Elementos.Publicacion
import kotlinx.android.synthetic.main.fragment_horizontal.*
import kotlinx.android.synthetic.main.fragment_vertical.*

class MainActivity : AppCompatActivity() {
    lateinit var recyclerViewhistories: RecyclerView
    private val recyclerViewAdapter: RecyleViewAdapter = RecyleViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val publis: Array<Publicacion> = Publicacion.publicaciones()
        val adapterPublis = AdapterPublis(this, publis)
        ListaPublicaciones.adapter = adapterPublis




        recyclerViewhistories = findViewById(R.id.historiasView)
        recyclerViewhistories.setHasFixedSize(true)
        recyclerViewhistories.layoutManager=  LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewAdapter.RecycleAdapter(Histories.historias(),this)
        recyclerViewhistories.adapter=recyclerViewAdapter


    }
}