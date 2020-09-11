/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 9:38 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 3:25 PM
 *
 */

package dev.ucokcode.dieng.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.utils.WisataAdapter
import dev.ucokcode.dieng.viewModel.JelajahViewModel

class MainJelajah : Fragment(R.layout.fragment_main_jelajah) {
    private val model: JelajahViewModel by activityViewModels()
    private lateinit var mlistWisata: RecyclerView
    private lateinit var mjelajahScroll: ScrollView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mlistWisata = view.findViewById(R.id.list_wisata)
        mjelajahScroll = view.findViewById(R.id.jelajah_scroll)
        showList()
    }

    private fun handlerClick(position: Int) {
        model.setArticle(position)
    }

    private fun showList() {
        val adapter = WisataAdapter(model.list) {
            handlerClick(it)
        }
        mlistWisata.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this.context)
            this.adapter = adapter
        }
        mjelajahScroll.smoothScrollTo(0, 0)
    }
}