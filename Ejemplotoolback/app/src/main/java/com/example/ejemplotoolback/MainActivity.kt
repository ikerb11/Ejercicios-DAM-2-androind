package com.example.ejemplotoolback

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.favoritos->{
                // Manejar clic en la opción 1
                Toast.makeText(applicationContext,"FAVORITOS",Toast.LENGTH_LONG).show()
                true
            }
            R.id.buscar->{
                // Manejar clic en la opción 2
                Toast.makeText(applicationContext,"BUSCAR",Toast.LENGTH_LONG).show()
                true
            }
            R.id.compartir->{
                // Manejar clic en la opción 3
                Toast.makeText(applicationContext,"COMPARTIR",Toast.LENGTH_LONG).show()
                true
            }
            else->false
        }
        return super.onOptionsItemSelected(item)
    }
}

