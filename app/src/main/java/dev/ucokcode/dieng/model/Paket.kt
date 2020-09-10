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