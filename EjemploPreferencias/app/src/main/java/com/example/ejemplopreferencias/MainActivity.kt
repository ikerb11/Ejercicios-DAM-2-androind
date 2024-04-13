package com.example.ejemplopreferencias


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  btn: Button
    lateinit var usuario: EditText
    lateinit var password: EditText
    lateinit var checkBox: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE)
        var editar = preferencias.edit()
        editar.putString("saludo", "Buenas tardes")
        editar.commit()
        usuario= findViewById(R.id.editUser)
        password= findViewById(R.id.editPassword)
        checkBox= findViewById(R.id.recuerdame)
        btn= findViewById(R.id.button)
        btn.setOnClickListener{
            var preferencias2 = getSharedPreferences("datos", Context.MODE_PRIVATE)
            var valor:String? = preferencias2.getString("saludo", "Otro")
            Toast.makeText(this,valor,Toast.LENGTH_LONG).show()
        }
    }
}