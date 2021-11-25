package android.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val factsLiveDataObjects = MutableLiveData<String>("Dog is Barking")

    // securing MutableLiveData data
   val factsLiveData : LiveData<String>
   get() = factsLiveDataObjects

    fun updateLiveData(){
        factsLiveDataObjects.value = "Eagle is Flying"
    }
}