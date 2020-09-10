/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 3:49 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 3:03 AM
 *
 */

package dev.ucokcode.dieng.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.viewModel.JelajahViewModel

class JelajahPager : Fragment(R.layout.fragment_jelajah_pager) {

    private val model: JelajahViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val modelId = view.findViewById<TextView>(R.id.modelId)

        model.getArticle().observe(viewLifecycleOwner, {
            modelId.text = it.content
        })
    }


}