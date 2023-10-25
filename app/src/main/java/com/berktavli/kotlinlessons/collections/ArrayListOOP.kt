package com.berktavli.kotlinlessons.collections

import android.widget.ArrayAdapter

fun main() {
   val o1 = Students(200,"Zeynep","9c")
   val o2 = Students(200,"Ali","11c")
   val o3 = Students(200,"Kadir","12c")

    val studentsListesi = ArrayList<Students>()
    studentsListesi.add(o1)
    studentsListesi.add(o2)
    studentsListesi.add(o3)

    for (s in studentsListesi){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")

    }
}