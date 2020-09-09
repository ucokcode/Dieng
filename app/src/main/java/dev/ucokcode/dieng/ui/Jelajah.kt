package dev.ucokcode.dieng.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.data.ObjekWisataData
import dev.ucokcode.dieng.utils.WisataAdapter
import kotlinx.android.synthetic.main.activity_jelajah.*

class Jelajah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajah)
        list_wisata.setHasFixedSize(true)
        showList()
    }

    private fun showList() {
        list_wisata.layoutManager = LinearLayoutManager(this)
        val adapter = WisataAdapter(ObjekWisataData.listObjek)
        list_wisata.adapter = adapter
    }
}