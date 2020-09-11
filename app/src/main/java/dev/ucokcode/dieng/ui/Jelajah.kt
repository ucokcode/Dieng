/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 9:38 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 3:49 AM
 *
 */

package dev.ucokcode.dieng.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.data.ObjekWisataData
import dev.ucokcode.dieng.ui.fragment.MainJelajah
import dev.ucokcode.dieng.utils.JelajahViewModelFactory

class Jelajah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajah)

        val mainFragment = MainJelajah()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.jelajah_container, mainFragment)
            addToBackStack(null)
            commit()
        }

    }

    override fun getDefaultViewModelProviderFactory(): ViewModelProvider.Factory {
        return JelajahViewModelFactory(ObjekWisataData.list)
    }

}