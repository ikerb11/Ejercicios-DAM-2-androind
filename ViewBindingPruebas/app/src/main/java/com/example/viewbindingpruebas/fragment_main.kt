package com.example.viewbindingpruebas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindingpruebas.databinding.ActivityMainBinding
import com.example.viewbindingpruebas.databinding.FragmentMainBinding


class fragment_main : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.text.text = "Hola"
        binding.button.setOnClickListener {
            binding.text.text = binding.editTextText.text.toString()
        }
        super.onViewCreated(view, savedInstanceState)
    }
}