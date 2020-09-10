/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 12:25 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 12:24 AM
 *
 */

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