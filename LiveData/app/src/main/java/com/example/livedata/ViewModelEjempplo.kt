package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelEjemplo: ViewModel() {

    val miLiveData: MutableLiveData<String> = MutableLiveData()


    fun procesarTexto(texto: String, contrasena: String) {
        // Procesar el texto de alguna manera (en este caso, simplemente lo invertimos)
        val resultado = texto.reversed()
        val contrasena = contrasena.reversed()
        miLiveData.value=resultado + contrasena
    }
}