package com.example.ejemplos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MensajeAxrividad extends AppCompatActivity {
    TextView mensajePantalla;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_actividad);
        mensajePantalla=(TextView) findViewById(R.id.mimensaje);
        Intent i = getIntent();
        String mensaje = i.getStringExtra("elmensajico");
        boolean mibol = i.getBooleanExtra("mibooleano", false);
        mensajePantalla.setText(mensaje);
    }
}
