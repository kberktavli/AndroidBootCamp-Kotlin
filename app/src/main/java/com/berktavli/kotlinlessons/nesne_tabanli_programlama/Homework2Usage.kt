package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {

    val f = Homework2()
    println("******* 1.Sorunun Cevabı *******")
    val gelenDeger = f.kmConverterToMph(50)
    println("Mph cinsinden = $ gelenDeger\n")

    println("******* 2.Sorunun Cevabı *******")
    f.alanHesapla(6,5)

    println("******* 3.Sorunun Cevabı *******")
    val faktoriyelHesabı = f.fakHesapla(5)
    println("Faktoriyel'nin sonucu : $faktoriyelHesabı")

    println("******* 4.Sorunun Cevabı *******")
    f.soru4("eleyemediklerimizdenmisiniz")

    println("******* 5.Sorunun Cevabı *******")
    val gelenSonuc = f.soru5(5)
    println("Bir iç acısı : $gelenSonuc")
    println("******* 6.Sorunun Cevabı *******")
    val maasHesap = f.soru6(19)
    println("Bu Ay Maaş'ınız $maasHesap tl'dir")
    println("******* 7.Sorunun Cevabı *******")
    val otoparkUcret = f.soru7(5)
    println("Otopark Ücreti : $otoparkUcret")

}

