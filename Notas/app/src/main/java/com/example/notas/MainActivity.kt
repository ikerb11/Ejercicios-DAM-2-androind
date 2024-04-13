package com.example.notas

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.StringReader

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_guardar= findViewById<Button>(R.id.button);
        val notas=findViewById<EditText>(R.id.notas);
        btn_guardar.setOnClickListener{
            val  url="https://www.google.es"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent);
        }
    }

}