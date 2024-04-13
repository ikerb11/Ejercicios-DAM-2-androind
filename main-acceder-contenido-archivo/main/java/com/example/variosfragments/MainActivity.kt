package com.example.variosfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.variosfragments.fragments.CargarDatos
import com.example.variosfragments.fragments.OnSongSelectedListener
import com.example.variosfragments.modelos.Song

class MainActivity : AppCompatActivity(),OnSongSelectedListener {

    lateinit var texto:TextView
    lateinit var cargarDatos:CargarDatos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto=findViewById(R.id.texto)
        cargarDatos= CargarDatos()
       // var datos:String=cargarDatos.loadJSONFromAsset(this,"data.json")
        //texto.setText(datos)
        var datos:MutableList<Song> = cargarDatos.loadJSONFromAsset(this,"data.json")
        texto.setText(datos[0].nombre)
    }

}





/*
override  fun onArticleSelected(article_id: Int){
    Toast.makeText(application,"MÉTODO",Toast.LENGTH_LONG).show()
}

/*fun loadJSONFromAsset(context: Context, filename: String):String{
    val json: String
    try{
        val inputStream= context.assets.open(filename)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        json = String(buffer, Charsets.UTF_8)
    }catch (ex: Exception){
        ex.printStackTrace()
        return ""
    }
    return json
}*/