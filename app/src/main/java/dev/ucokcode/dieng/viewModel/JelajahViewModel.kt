package dev.ucokcode.dieng.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import dev.ucokcode.dieng.model.Wisata

class JelajahViewModel(list: ArrayList<Wisata>) : ViewModel() {
    val list: ArrayList<Wisata> = list
    private var _articleId = MutableLiveData<Int>()
    private var _article = Transformations.map(_articleId, {
        return@map list[it]
    })


    fun setArticle(position: Int) {
        _articleId.value = position
    }

    fun getArticle(): LiveData<Wisata> = _article
}