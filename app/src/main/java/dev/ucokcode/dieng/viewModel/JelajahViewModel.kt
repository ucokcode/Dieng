package dev.ucokcode.dieng.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.data.ObjekWisataData
import dev.ucokcode.dieng.model.Wisata

class JelajahViewModel : ViewModel() {
    private val _objekWisata = MutableLiveData<ArrayList<Wisata>>().apply {
        ObjekWisataData.listObjek
    }
    fun getObjekWisata(): LiveData<ArrayList<Wisata>> {
        return _objekWisata
    }

}