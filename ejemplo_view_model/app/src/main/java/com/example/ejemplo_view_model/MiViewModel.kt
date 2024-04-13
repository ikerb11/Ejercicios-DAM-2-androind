package com.example.ejemplo_view_model

import androidx.lifecycle.ViewModel

class MiViewModel: ViewModel() {
    var contador: String = "Buenos dias"

    fun cambiarNombre(nombre:String){
        contador = "Buenos dias $nombre"
    }
}