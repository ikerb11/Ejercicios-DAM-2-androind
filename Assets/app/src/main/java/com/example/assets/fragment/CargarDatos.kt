package com.example.assets.fragment

import android.content.Context
import com.example.assets.Song
import org.json.JSONArray
import org.json.JSONObject

class CargarDatos {
    lateinit var context: Context


      //fun loadJSONFromAsset(context: Context,filename: String):String{
      fun loadJSONFromAsset(context: Context,filename: String):MutableList<Song>{
        var json: String
        val jsonList: MutableList<Song> = mutableListOf()
        try{
            val inputStream= context.assets.open(filename)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()

            json = String(buffer, Charsets.UTF_8)
            val jsonArray:JSONArray= JSONArray(json)
            json=json
            for (i in 0 until jsonArray.length()){
                //recojo el primer elemento del array
                val jsonObject:JSONObject = jsonArray.getJSONObject(i)

                //val nom:String =jsonObject.getString("nombre")
                //val edad:Int=jsonObject.getInt("edad")
                //val cancion:String=jsonObject.getString("mejor_cancion")
               val song= Song(
                    nombre = jsonObject.getString("nombre"),
                    edad=jsonObject.getInt("edad"),
                    cancion = jsonObject.getString("mejor_cancion")
                )
                jsonList.add(song)

            }



        }catch (ex: Exception) {
            ex.printStackTrace()
            //return ""
        }

        return jsonList
    }

}


