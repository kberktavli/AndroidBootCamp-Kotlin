package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    //Nesne Oluşturma

    val bmw = Car("blue",100,true)
    val volvo = Car("beyaz",40,true)

    println("Rengi : ${bmw.color} \nHız : ${bmw.speed} \nÇalısıyor mu ? : ${bmw.isActive}\n")

    //atama
    bmw.color = "Mavi"
    bmw.speed = 59
    bmw.isActive = true
    println("atama işlemi sonrası")
    println("Rengi : ${bmw.color} \nHız : ${bmw.speed} \nÇalısıyor mu ? : ${bmw.isActive} ")

    println("------------------")
    bmw.info()
    bmw.stop()
    bmw.info()
    volvo.speedUp(kacKM = 22)
    volvo.info()

}