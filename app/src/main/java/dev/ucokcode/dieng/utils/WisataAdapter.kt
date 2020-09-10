/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 3:49 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 2:47 AM
 *
 */

package dev.ucokcode.dieng.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata
import dev.ucokcode.dieng.ui.fragment.JelajahPager


class WisataAdapter(private val list: ArrayList<Wisata>, private val setId: (Int) -> Unit) :
    RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {
    class WisataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var mbackground: ImageView = view.findViewById(R.id.mbackground)
        var mtitle: TextView = view.findViewById(R.id.mtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.objek_wisata_card, parent, false)
        return WisataViewHolder(view)

    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val item = list[position]

        Glide.with(holder.itemView.context)
            .load(item.gambar)
            .apply(RequestOptions())
            .into(holder.mbackground)

        holder.mtitle.text = item.title

        holder.itemView.setOnClickListener { view ->
            setId(position)
            val activity = view!!.context as AppCompatActivity
            val secondFragment: Fragment = JelajahPager()
            activity.supportFragmentManager.beginTransaction().apply {
                addToBackStack(null)
                replace(R.id.jelajah_container, secondFragment)
                commit()
            }
        }
    }

    override fun getItemCount(): Int = list.size
}
