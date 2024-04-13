package com.example.ejemplo_view_model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    lateinit var nombre: EditText
    private lateinit var miViewModel: MiViewModel
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto = findViewById(R.id.texto)
        nombre = findViewById(R.id.editTextText)
        button= findViewById(R.id.buttonIncrement)
        miViewModel = ViewModelProvider(this).get(MiViewModel::class.java)
        actualizarContador()
        button.setOnClickListener{
            miViewModel.cambiarNombre(nombre.text.toString())
            actualizarContador()
        }
    }
    private fun actualizarContador(){
        texto.text= miViewModel.contador
    }

}