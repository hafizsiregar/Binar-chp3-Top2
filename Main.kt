package and.binar.bangundatarand

import java.lang.Exception

fun main() = try {
    print(
        "Masukan Jenis Bangun Datar - Persegi(a), Persegi Panjang(b), Segitiga(c), " +
                "Lingkaran(d), Jajar Genjang(e), Belah Ketupat(f), Trapesium(g), Layang Layang(h):"
    ) //update the master
    when (readLine()) {
        "a" -> {
            //Hitung Persegi
        }

        "b" -> {
            //Hitung Persegi Panjang
        }

        "c" -> {
            //Hitung Segitiga
        }

        "d" -> {
            //Hitung Lingkaran
        }

        "e" -> {
            //Hitung Jajar Genjang
        }

        "f" -> {
            //Hitung Belah Ketupat
        }

        "g" -> {
            print("Masukan Sisi Atas :")
            val sisiAtas = readLine()!!.toInt()
            print("Masukan Sisi Bawah :")
            val sisiBawah = readLine()!!.toInt()
            print("Masukan tinggi :")
            val tinggiTrapesium = readLine()!!.toInt()
            print("Luas Trapesium = ${((sisiAtas+sisiBawah)*tinggiTrapesium)/2}")
            //Hitung Trapesium
        }

        "h" -> {
            //Hitung Layang Layang
        }

        else -> {
            print("Operasi Tidak Valid")
        }
    }
} catch (i: Exception){
    print("Pilih Jenis Bangun Datar")
}
