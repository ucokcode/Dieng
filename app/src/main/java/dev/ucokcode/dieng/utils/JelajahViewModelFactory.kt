package dev.ucokcode.dieng.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.ucokcode.dieng.model.Wisata
import dev.ucokcode.dieng.viewModel.JelajahViewModel

@Suppress("UNCHECKED_CAST")
class JelajahViewModelFactory(private val list: ArrayList<Wisata>) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JelajahViewModel::class.java)) {
            return JelajahViewModel(list) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}