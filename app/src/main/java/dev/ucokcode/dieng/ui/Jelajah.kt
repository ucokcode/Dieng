package dev.ucokcode.dieng.ui

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.data.ObjekWisataData
import dev.ucokcode.dieng.utils.WisataAdapter
import kotlinx.android.synthetic.main.activity_jelajah.*

class Jelajah : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajah)
        val adapter = WisataAdapter(
            this,
            R.layout.objek_wisata_card, ObjekWisataData.listObjek
        )
        list_wisata.adapter = adapter
        list_wisata.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemValue = ObjekWisataData.listObjek[position].title
                title = itemValue
            }
        }
    }
}