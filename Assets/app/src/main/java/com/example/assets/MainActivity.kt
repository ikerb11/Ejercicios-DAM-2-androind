package com.example.assets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.assets.fragment.CargarDatos

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    lateinit var cargarDatos: CargarDatos;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto=findViewById(R.id.texto)
        cargarDatos= CargarDatos()
         var datos: MutableList<Song> =cargarDatos.loadJSONFromAsset(this,"data.json")
        texto.setText(datos[0].nombre)
        //var datos:MutableList<Song> = cargarDatos.loadJSONFromAsset(this,"data.json")
        //texto.setText(datos[0].nombre)
    }
}