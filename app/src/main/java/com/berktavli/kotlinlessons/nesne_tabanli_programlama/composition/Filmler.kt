package com.berktavli.kotlinlessons.nesne_tabanli_programlama.composition

data class Filmler(var film_id : Int,
                   var film_ad : String,
                   var film_yil : Int,
                   var kategori: Kategoriler, // kategori ve yonetmen composition'dır
                   var yonetmen : Yonetmenler) {
}