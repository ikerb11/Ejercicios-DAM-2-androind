package com.example.aplicacionfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), OnFragmentActionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onClickFragmentButton(datos: Bundle?) {
        var nombre:String?= datos?.getString("nombre")
        Toast.makeText(application,"CLIC FRAGMENT", Toast.LENGTH_LONG).show()

        val fragment2 = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NoListaFragment?
        if (fragment2==null) Toast.makeText(application, "NO FRAGMENT", Toast.LENGTH_LONG).show();
        if(nombre!=null) fragment2?.updateData(nombre)
    }
}