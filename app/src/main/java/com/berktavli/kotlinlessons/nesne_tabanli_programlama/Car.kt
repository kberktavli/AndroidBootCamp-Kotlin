package com.berktavli.kotlinlessons.nesne_tabanli_programlama

class Car( var color : String, var speed : Int, var isActive : Boolean) {

    fun info (){
        println("Rengi : ${this.color} \nHız : ${this.speed} \nÇalısıyor mu ? : ${this.isActive} ")
    }

    fun run(){ // side effect : Fonksiyon ile sınıfın özelliklerini değiştirebilme.
        isActive = true
        speed = 5
    }
    fun stop(){ // side effect : Fonksiyon ile sınıfın özelliklerini değiştirebilme.
        isActive = false
        speed = 0
    }

    fun speedUp(kacKM:Int){
        speed +=kacKM
    }


    fun speedDown(kacKM:Int){
        speed -=kacKM
    }


}

//this veya self(Swift) : Bulunduğumuz sınıf
//super: Kalıtım varsa üst sınıfı temsil eder.