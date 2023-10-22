package com.berktavli.kotlinlessons.nesne_tabanli_programlama

class Function {
    //void-geri dönüş değeri olmayan

    fun sayHello(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //Alt+ J

    //return - geri dönüş değeri olan

    fun sayHello2() : String{
        val sonuc : String = "Merhaba Ahmet"
        return sonuc
    }

    fun sayHello3(name : String){
        val sonuc = "Merhaba $name"
        println(sonuc)

    }

    fun sayHello4(name : String) : String{
        val sonuc= "Merhaba $name"
        return sonuc
    }

    fun addition (sayi1 : Int, sayi2 : Int) : Int{
        val add = sayi1 + sayi2
        return add
    }

    //OverLoading

    fun multiplication(sayi1 : Int , sayi2: Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }

    fun multiplication(sayi1 : Double,sayi2 : Int, isim: String){
        println("Çarpma : ${sayi1 * sayi2} - İşlem Yapan : $isim")


    }

}