package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    ucretHesapla(100, KonserveBoyut.KUCUK)
}

fun ucretHesapla(adet : Int, boyut: KonserveBoyut ){
 when(boyut){
     KonserveBoyut.KUCUK -> println("Toplam Maliyet : ${adet * 30} ₺ ")
     KonserveBoyut.ORTA -> println("Toplam Maliyet : ${adet * 40} ₺ ")
     KonserveBoyut.BUYUK -> println("Toplam Maliyet : ${adet * 50} ₺ ")
 }
}