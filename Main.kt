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
            print("Masukan Tinggi :")
            val tinggiSegitiga = readLine()!!.toInt()
            print("Masukan Alas :")
            val alasSegitiga = readLine()!!.toInt()
            print("Luas Segitiga = ${(tinggiSegitiga*alasSegitiga)/2}")
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
