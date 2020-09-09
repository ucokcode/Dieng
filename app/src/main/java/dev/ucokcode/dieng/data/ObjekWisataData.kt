package dev.ucokcode.dieng.data

import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata

object ObjekWisataData {
    val listObjek: ArrayList<Wisata> by lazy {
        return@lazy arrayListOf<Wisata>().apply {
            add(
                Wisata(
                    id = 1,
                    title = "Kawah candradimuk",
                    gambar = R.drawable.o_kawahcadradimuka,
                    content = "blablablabla"
                )
            )
            add(
                Wisata(
                    id = 2,
                    title = "Telaga Warna",
                    gambar = R.drawable.o_telagawarna,
                    content = "blablabla"
                )
            )
        }
    }
}