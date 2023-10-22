package com.berktavli.kotlinlessons.standartprogramlama

import android.util.Log
import android.util.Log.*

fun main() {
    //1,2,3

    for (i in 1..3){ //Swift : i in 1...3
        println("Döngü : $i")
    }

    for (i in 10..20 step 5){
        print("Döngü : $i\n")
    }

    for (i in 20 downTo 10 step 5){
        print("Döngü : $i\n")
    }

    val dizi = listOf(10,20,30,40,50)

    for (i in dizi){
        println("Dizi başlangıcı $i")
        println("Dizi indeksi: $i")
    }

    for (i in 0 until dizi.size){
        println(i)

    }

    // 1,2,3,4,5
    var sayac = 1
    while (sayac < 6 ){
        println("Döngü  : $sayac")
        //sayac+=1
        //sayac = sayac + 1
        sayac++
    }

    for (i in 1..5){
        if (i == 3){
            break // döngüyü durdurur
        }
        println("Döngü 5 : $i")
    }

    for(i in 1..5){
        if (i == 3){
            continue // adım atlar
        }
        println("Döngü 6 : $i")
    }

    // break ve continue'yu kullanırken koşullu kullanmak lazım

}