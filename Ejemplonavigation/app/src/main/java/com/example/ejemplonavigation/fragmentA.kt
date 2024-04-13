package com.example.ejemplonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
/**
 * A simple [Fragment] subclass.
 * Use the [fragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentA : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_a, container, false)
        val bfragmentB = vista.findViewById<Button>(R.id.buttonB)
        val bfragmentLista = vista.findViewById<Button>(R.id.buttonLista)

        bfragmentB.setOnClickListener {
            vista.findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
        bfragmentLista.setOnClickListener {
            vista.findNavController().navigate(R.id.action_fragmentA_to_fragmentLista)
        }
        return vista
    }
}