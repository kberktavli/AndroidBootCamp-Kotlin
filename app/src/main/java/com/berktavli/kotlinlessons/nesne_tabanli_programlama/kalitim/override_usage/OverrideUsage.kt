package com.berktavli.kotlinlessons.nesne_tabanli_programlama.kalitim.override_usage

fun main() {
    val hayvan = Animal()
    val memeli = Mammal()
    val kedi = Cat()
    val kopek = Dog()

    hayvan.soundOut() // Kalıtım yok
    memeli.soundOut() // Kalıtım superclass'ından var
    kedi.soundOut() //Kalıtım var fakat override yardımıyla kendi fonksiyonunu kullandı.
    kopek.soundOut() //Kalıtım var fakat override yardımıyla kendi fonksiyonunu kullandı.
}