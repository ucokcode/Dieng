/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 9:38 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 3:49 AM
 *
 */

package dev.ucokcode.dieng.data

import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.model.Wisata

object ObjekWisataData {
    private var content: ArrayList<String> = arrayListOf(
        """
            Kawah Candradimuka
            (Candradimuka Crater)
            terletak di atas sebuah bukit yang lumayan tinggi dengan jarak tempuh sejauh 5 kilometer. Dengan track naik dengan kemiringan antara 30 hingga 45 derajat dengan jalan berbatu dan tanah yang cukup labil untuk ditapaki.

            Secara harfiah kawah Candradimuka berarti “Kawah” = kawah gunung, lubang, kuali dan “Candradimuka” = sinar bulan
        """.trimIndent()

    )
    val list: ArrayList<Wisata> =
        arrayListOf<Wisata>(
            Wisata(1, "Kawah candradimuk", R.drawable.o_kawahcadradimuka, content[0]),
            Wisata(2, "Telaga Warna", R.drawable.o_telagawarna, "blablabla")
        )
}

