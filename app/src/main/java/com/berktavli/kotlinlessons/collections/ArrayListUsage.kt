package com.berktavli.kotlinlessons.collections

fun main() {
    //tanimlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    meyveler.add("Elma")//0. index
    meyveler.add("Muz")//1. index'e kaydedecek
    meyveler.add("Kiraz")//2. index'e kaydecek

    println(meyveler)
    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma işlemi
    println(meyveler[1])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrolü : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")
    println("İçeriyor mu : ${meyveler.contains("Kirazs")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){ //enumareted() -> Swift
        println("Sonuç : $indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}