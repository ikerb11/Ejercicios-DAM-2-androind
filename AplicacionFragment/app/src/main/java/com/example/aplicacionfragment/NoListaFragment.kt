package com.example.aplicacionfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


/**
 * A simple [Fragment] subclass.
 * Use the [NoListaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NoListaFragment : Fragment() {
    var texto:String?=null
    lateinit var mitexto:TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista= inflater.inflate(R.layout.fragment_no_lista, container, false)
        mitexto= vista.findViewById(R.id.mitexto)
        return vista;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity=requireActivity();
    }

    fun updateData(nombre:String){
        mitexto.setText(nombre).toString()
    }

}