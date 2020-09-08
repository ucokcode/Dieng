package dev.ucokcode.dieng.data

import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata

object ObjekWisataData {
    val listObjek: ArrayList<Wisata> by lazy {
        var itemList = arrayListOf<Wisata>()
        itemList.add(Wisata(1, "Kawah candradimuk", R.drawable.o_kawahcadradimuka, "blablablabla"))
        itemList.add(Wisata(2, "Telaga Warna", R.drawable.o_telagawarna, "blablabla"))
        itemList
    }
}