package dev.ucokcode.dieng.utils

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata

class WisataAdapter(var mctx: Context, var resourses: Int, val list: ArrayList<Wisata>) :
    ArrayAdapter<Wisata>(mctx, resourses, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(mctx)
        val view = layoutInflater.inflate(resourses, null)
        val mbackgroud = view.findViewById<ImageView>(R.id.mbackgroud)
        val mtitle = view.findViewById<TextView>(R.id.mtitle)
        val mitem: Wisata = list[position]
        mbackgroud.setImageResource(mitem.gambar)
        mtitle.text = mitem.title
        return view
    }
}