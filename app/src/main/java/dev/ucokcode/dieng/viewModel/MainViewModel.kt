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

class MainViewModel : ViewModel() {
    private val _isClicked = MutableLiveData<Boolean>().apply { value = false }

    private val backgroundSize = Transformations.map(_isClicked) {
        return@map if (it) 400 else 800
    }

    fun getBackgroundSize(): LiveData<Int> = backgroundSize
    fun getClick(): LiveData<Boolean> = _isClicked

    fun setClick() {
        _isClicked.apply {
            value = value!!.not()
        }
    }

    fun setClick(eventValue: Boolean) {
        _isClicked.apply {
            value = eventValue
        }
    }
}