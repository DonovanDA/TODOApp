package com.example.tareaintento2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel

class MainActivity : AppCompatActivity() {

    lateinit var Titulo: EditText
    lateinit var Descrip: EditText
    lateinit var Butt: Button
    lateinit var Lista: ListView
    private val TareasViewModel:TareasViewModel by ViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Titulo = findViewById(R.id.etTitulo)
        Descrip = findViewById(R.id.etDescrip)
        Butt = findViewById(R.id.Insert)
        Lista = findViewById(R.id.lvLelemen)

        val elementos = mutableListOf<String>()
        elementos.add("Hola")
        elementos.add("Mundo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, elementos)
        Lista.adapter = adapter

        Butt.setOnClickListener {

            val guaTitu = Titulo.text.toString()
            Toast.makeText(this, guaTitu, Toast.LENGTH_SHORT).show()
            elementos.add(guaTitu)
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "${elementos.size}",Toast.LENGTH_SHORT).show()
            Log.d("Donovan", guaTitu)
            val guaDesc = Descrip.text.toString()
            Toast.makeText(this, guaDesc, Toast.LENGTH_SHORT).show()
            Log.d("Donovan", guaDesc)



        }

    }
}