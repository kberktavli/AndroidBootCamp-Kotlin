package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    //val sonuc = 5.carpi(2)
    val sonuc = 5 carpi 2 // infix sayesinde
    println(sonuc)
}


infix fun Int.carpi(sayi : Int) : Int {

    return this * sayi // this = Int sınıfı
}