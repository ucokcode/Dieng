package dev.ucokcode.dieng.data

import dev.ucokcode.dieng.model.Paket

object PaketWisataData {

    private val trips = arrayListOf<ArrayList<String>>(
        arrayListOf<String>(
            "Sunrise Sikunir (optional)",
            "Komplek Candi Arjuna",
            "Candi GatutKaca",
            "Museum Kailasa",
            "Telaga Warna",
            "Telaga Pengilon",
            "Gardu Pandang Lembah Dieng",
            "Kawah Sikidang",
            "Goa Semar",
            "Goa Sumur",
            "Goa Jaran",
            "Batu Semar",
            "Pemutaran film Sejarah Dieng",
            "Tuk Bimalukar",
        )
    )


    var list = arrayListOf<Paket>(
        Paket("Paket 1 Hari", 200000, trips[0], true, true, true, false, true),
        Paket("Paket 2 Hari 1 Malam", 200000, trips[0], true, true, true, true, true),
        Paket("Paket 3 Hari 2 Malam", 200000, trips[0], true, true, true, true, true)
    )
}