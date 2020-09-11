/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 9:38 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 5:59 PM
 *
 */

package dev.ucokcode.dieng.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.viewModel.JelajahViewModel

class JelajahPager : Fragment(R.layout.fragment_jelajah_pager) {

    private val model: JelajahViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val linearContainer = view.findViewById<LinearLayout>(R.id.linear_container)
        val card = View.inflate(context, R.layout.objek_wisata_card, null)
        val mbackground = card!!.findViewById<ImageView>(R.id.mbackground)
        val modelId = view.findViewById<TextView>(R.id.modelId)

        model.getArticle().observe(viewLifecycleOwner, {
            modelId.text = it.content
            Glide.with(this)
                .load(it.gambar)
                .apply(RequestOptions())
                .into(mbackground)
            linearContainer.addView(card, 0)
        })
    }


}