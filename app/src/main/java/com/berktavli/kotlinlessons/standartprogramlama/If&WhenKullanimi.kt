package com.berktavli.kotlinlessons.standartprogramlama

fun main() {

    val yas = 1
    val isim = "Mehmet"

    if (yas >=18){ //Swift: if yas=>18{  }
        println("reşitsiniz")
    }else{
        println("reşit değilsiniz")
    }

    if (isim == "Ahmet"){
        println("Merhaba ahmet ")
    }else if (isim == "Mehmet"){
        println("Merhaba mehmet")
    }else{
        println("Tanınmayan Kişi")
    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s ==123456){
        println("hosgeldiniz! giris yapildi")
    }else{
        println("Hatali Giris")
    }

    val sayi = 11

    if (sayi == 10 || sayi == 20){
        println("sayi 10 veya 20 'dir")
    }else{
        println("Sayı 10 veya 20 değildir")
    }

    //When : Switch

    val gun = 3
    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")
    }


}