package com.example.ejemplopreferencias

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class TareaViewModel(private val repositorio: TareaRepositorio):ViewModel() {
    val listaTarea: LiveData<List<Tarea>> = repositorio.listaTareas.asLiveData()

    fun insertar(tarea:Tarea) = viewModelScope.launch{
        repositorio.insert(tarea)
    }
    //Mover
    //(private val tareaDao: TareaDao)
    //val listaTareas: Flow<List<Tarea>> = tareaDao.obtenerTareaOrdenada()
    //suspend fun (tarea: Tarea){
    //    tareaDao.insertar(tarea)
    //}
}
class TareasViewModelFactory(private val repositorio: TareaRepositorio ):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TareaViewModel::class.java)){
            return TareaViewModel(repositorio) as T
        }
        throw IllegalArgumentException()
    }

}