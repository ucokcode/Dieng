package dev.ucokcode.dieng.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.data.ObjekWisataData
import dev.ucokcode.dieng.utils.JelajahViewModelFactory
import dev.ucokcode.dieng.utils.WisataAdapter
import dev.ucokcode.dieng.viewModel.JelajahViewModel
import kotlinx.android.synthetic.main.activity_jelajah.*

class Jelajah : AppCompatActivity() {
    private val viewModel: JelajahViewModel by viewModels { JelajahViewModelFactory(ObjekWisataData.list) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jelajah)
        showList()
    }

    private fun showList() {
        val adapter = WisataAdapter(viewModel.list)
        list_wisata.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@Jelajah)
            this.adapter = adapter
        }
        jelajah_scroll.smoothScrollTo(0, 0)
    }
}