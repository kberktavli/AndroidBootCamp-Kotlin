package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    val a = Asinifi()

   /*
    println(a.x)
    a.metod()

    //virtual object - sanal nesne- isimsiz nesne
    println(Asinifi().x)
    Asinifi().metod()
    */
    //Yukarıdaki örnektekiler sanal nesne, aşağıdaki örnekteki gibi olan parantezsiz olanlar companion
    //object olarak yani statik yapı olarak geçiyor.

    println(Asinifi.x)
    Asinifi.metod()
}