package dev.ucokcode.dieng.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import dev.ucokcode.dieng.model.Wisata

class JelajahViewModel(val list: ArrayList<Wisata>) : ViewModel() {
    private var _articleId = MutableLiveData<Int>()
    private var _article = Transformations.map(_articleId) {
        list[it]
    }


    fun setArticle(position: Int) {
        _articleId.value = position
    }

    fun getArticle(): LiveData<Wisata> = _article
}