package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    val f = Function()
    val gelenSonuc = f.sayHello2()
    println(gelenSonuc)

    f.sayHello3("Kadir Berk")
    val deneme4 = f.sayHello4("Zeynep")
    println(deneme4)

    val incomingTotal = f.addition(1 ,2)
    println("Gelen toplam : $incomingTotal ")

    f.multiplication(10.80,20,"kadir")
}