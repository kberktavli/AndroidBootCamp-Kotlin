package com.berktavli.kotlinlessons.degiskenler

fun main() {

    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'A'
    var ogrenciDurumu = true

    println("Ögrenci Adı : ${ogrenciAdi}")
    println("Öğrenci Yas: ${ogrenciYas}")
    println("Öğrenci Boy : ${ogrenciBoy}")
    println("Öğrenci Baş Harf : ${ogrenciBasHarf}")
    println("Öğrenci Durumu : $ogrenciDurumu")
    var a : Int = 10
    var b : Int = 29
    println("$a x $b : ${a*b}  ")

    //Sabitler-Constant
    //val(kotlin) - let(swift) - final (java)

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val number = 40
    println(number)
    //number = 70

    //Type-casting ( Tür Dönüşümü )

    val i = 42
    val d = 78.98
    //sayısaldan sayısala dönüşüm

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    // sayısaldan metine dönüşüm

    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    // metinden sayısala dönüşüm

    val text = "67.64t"
    val sonuc5 = text.toDoubleOrNull()

    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşüm hatası meydana geldi")
    }

    sonuc5?.let{
        println(it)
    }
}