/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 12:25 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 12:24 AM
 *
 */

package dev.ucokcode.dieng.data

import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata

object ObjekWisataData {
    val list: ArrayList<Wisata> =
        arrayListOf<Wisata>(
            Wisata(1, "Kawah candradimuk", R.drawable.o_kawahcadradimuka, "blablablabla"),
            Wisata(2, "Telaga Warna", R.drawable.o_telagawarna, "blablabla")
        )

}

