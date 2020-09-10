/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 12:25 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 12:24 AM
 *  
 */

package dev.ucokcode.dieng.model

data class Paket(
    val nama: String,
    val harga: Int,
    val listLokasi: ArrayList<String>,
    val tourGuide: Boolean,
    val tiketMask: Boolean,
    val konsumsi: Boolean,
    val homestay: Boolean,
    val transportasi: Boolean
)