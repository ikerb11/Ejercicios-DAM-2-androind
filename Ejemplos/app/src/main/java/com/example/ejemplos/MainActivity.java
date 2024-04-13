package com.example.ejemplos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanningAdapter planningAdapter;
    private Button boton;
    private EditText nombre;
    private EditText apellido;
    private EditText email;
    private EditText telefono;
    private EditText observaciones;
    private Spinner cursos;
    private ArrayList curso= new ArrayList<String>();

    private String[] datos = {"Lunes","Martes", "Miercoles", "Jueves", "Viernes"};
    @SuppressLint("MissingInflated")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton= (Button) findViewById(R.id.button);
        nombre = (EditText) findViewById(R.id.mensajeNombre);
        apellido = (EditText) findViewById(R.id.mensajeApellidos);
        email = (EditText) findViewById(R.id.mensajeEmail);
        telefono = (EditText) findViewById(R.id.mensajeTelefono);
        observaciones = (EditText) findViewById(R.id.mensajeObservaciones);
        cursos=(Spinner) findViewById(R.id.spinnerCurso);
        curso.add("DAM");
        curso.add("DAW");
        curso.add("Marketing");
        curso.add("ADE");
        ArrayAdapter<String> aSpiner= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, curso);
        cursos.setAdapter(aSpiner);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    enviarMensaje(view);
            }
//
        //recyclerView=findViewById(R.id.recyclerView);
        //LinearLayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        //recyclerView.setLayoutManager(layoutManager);
        //planningAdapter= new PlanningAdapter(datos);
        //recyclerView.setAdapter(planningAdapter);

        });
    }
    public void enviarMensaje(View view){
        String minombre;
        String miapellido;
        String miemail;
        String mitelefono;
        String misobservaciones;
        String micurso;

        minombre= nombre.getText().toString();
        miapellido= apellido.getText().toString();
        miemail= email.getText().toString();
        mitelefono= telefono.getText().toString();
        misobservaciones= observaciones.getText().toString();

        Intent intent= new Intent(this,MensajeAxrividad.class);
        intent.putExtra("minombre",minombre);
        intent.putExtra("miapellido",miapellido);
        intent.putExtra("miemail",miemail);
        intent.putExtra("elmensajico",mitelefono);
        intent.putExtra("elmensajico",misobservaciones);
        intent.putExtra("mibooleano",true);
        startActivity(intent);
    }
}