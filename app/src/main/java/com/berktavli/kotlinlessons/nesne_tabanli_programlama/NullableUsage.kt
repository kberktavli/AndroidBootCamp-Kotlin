package com.berktavli.kotlinlessons.nesne_tabanli_programlama

fun main() {
    //Nullable- Null safety - Optional(Swift)
    var x = "Merhaba"

    //tanımlama kısmı
    var str : String? = null
    str = "Merhaba"
    //Kullanım
    //Yöntem 1
    //.trim() : white-space 'leri yok eder
    //? : Bu ifade uygulamayı çökertmez , ama null oldugunu gösterir
    // sorun yoksa cıktıyı bize direkt veriyor
    println("Yöntem 1 : ${str?.trim()}")

    //Yöntem 2
    //!! : Ben bu koduma güveniyorum burası null değil, bunu bu şekilde kullanabilirsin diyerek
    //bir iddia'da bulunuyoruz
    //println("Yöntem 2 : ${str!!.trim()}")

    //Yöntem 3
    if (str != null)  {
        println("Yöntem 3 : ${str.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4

    str?.let {
        println("Yöntem 4 : ${str.trim()}")

    }
}