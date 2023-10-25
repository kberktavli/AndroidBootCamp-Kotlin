package com.berktavli.kotlinlessons.collections

import android.widget.ArrayAdapter

fun main() {
   val o1 = Students(200,"Zeynep","9c")
   val o2 = Students(300,"Ali","11c")
   val o3 = Students(400,"Kadir","12c")

    val studentsListesi = ArrayList<Students>()
    studentsListesi.add(o1)
    studentsListesi.add(o2)
    studentsListesi.add(o3)

    for (s in studentsListesi){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")

    }

    //Sort-Sıralama
    println("Sayisal : Küçükten > Büyüğe")
    val siralama1 = studentsListesi.sortedWith(compareBy{it.no}) // ASC : ascend
    for (s in siralama1){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")
    }

    //Sort-Sıralama
    println("Sayisal :  Büyükten > Küçüğe")
    val siralama2 = studentsListesi.sortedWith(compareByDescending { it.no }) // DESC : descend
    for (s in siralama2){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")
    }

    //Sort-Sıralama ASC
    println("Metinsel :  Küçükten > Büyüğe")
    val siralama3 = studentsListesi.sortedWith(compareBy{ it.name }) // DESC : descend
    for (s in siralama3){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")
    }
    //Sort-Sıralama DESC
    println("Metinsel :  Büyükten > Küçüğe")
    val siralama4 = studentsListesi.sortedWith(compareByDescending{ it.name }) // DESC : descend
    for (s in siralama4){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")
    }

    //Filtreleme
    println("Filtreleme 1 : ")
    val filtreleme1 =  studentsListesi.filter { it.no > 200 }
    for (s in filtreleme1){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")
    }

    println("Filtreleme 2 : ")
    val filtreleme2 =  studentsListesi.filter { it.name.contains('a')}
    for (s in filtreleme2){
        println("No: ${s.no} - Adı : ${s.name} - Sınıf : ${s.sinif}")

    }


}