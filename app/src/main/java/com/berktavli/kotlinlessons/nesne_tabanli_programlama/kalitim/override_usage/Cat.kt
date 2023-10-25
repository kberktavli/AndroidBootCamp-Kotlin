package com.berktavli.kotlinlessons.nesne_tabanli_programlama.kalitim.override_usage

class Cat : Mammal() {
    override fun soundOut() {
        println("Miyav Miyav")
    }
}