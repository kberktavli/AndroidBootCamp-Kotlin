package com.berktavli.kotlinlessons.nesne_tabanli_programlama.interfaceusage

class ClassA : MyInterface{
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod 1 çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı"
    }
}