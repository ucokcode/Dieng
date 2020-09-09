package dev.ucokcode.dieng.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata


class WisataAdapter(private val list: ArrayList<Wisata>) :
    RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {
    inner class WisataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
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
            .apply(RequestOptions()).into(holder.mbackground)
        holder.mtitle.text = item.title
    }

    override fun getItemCount(): Int = list.size
}
