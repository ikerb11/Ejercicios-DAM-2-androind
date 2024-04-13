package com.example.livedata
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModelEjemplo
    lateinit var editTextResultado: TextView
    lateinit var editTextContrasenaResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextResultado=findViewById<TextView>(R.id.editTextResultado)
        editTextContrasenaResultado=findViewById<TextView>(R.id.editTextContrasenaResultado)
        var buttonProcesar=findViewById<Button>(R.id.buttonProcesar)
        var editTextEntrada=findViewById<EditText>(R.id.editTextEntrada)
        var editTextContrasenaEntrada=findViewById<EditText>(R.id.editContrasenaEntrada)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this).get(ViewModelEjemplo::class.java)

        viewModel.miLiveData.observe(this, Observer { nuevoValor ->
            editTextResultado.text=nuevoValor

        } )
        viewModel.miLiveData.observe(this, Observer { nuevoValor ->
            editTextContrasenaResultado.text=nuevoValor

        } )

        buttonProcesar.setOnClickListener {

            val textoEntrada = editTextEntrada.text.toString()
            val contrasenaEntrada = editTextContrasenaEntrada.text.toString()

            viewModel.procesarTexto(textoEntrada, contrasenaEntrada)
        }
    }
}