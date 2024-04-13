package com.example.livedata.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.R
import com.example.livedata.ViewModelEjemplo

class FragmentLive : Fragment() {

    private lateinit var viewModel: ViewModelEjemplo
    private lateinit var texto:TextView
    private lateinit var contrasena:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista:View = inflater.inflate(R.layout.fragment_live, container, false)
        texto=vista.findViewById(R.id.texto)
        contrasena=vista.findViewById(R.id.contrasena)
        //requiere activity hace referencia ala actividad que lo contiene
        viewModel = ViewModelProvider(requireActivity()).get(ViewModelEjemplo::class.java)

        viewModel.miLiveData.observe(viewLifecycleOwner, Observer {nuevoValor->
            Toast.makeText(context, "OBSERVANDO", Toast.LENGTH_LONG).show()
            texto.text=nuevoValor
        })

        return vista
    }

}