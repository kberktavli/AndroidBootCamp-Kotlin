package com.berktavli.kotlinlessons.nesne_tabanli_programlama.package1

open class A {
    var varsayilanDegisken = 1
    public var publicDegisken = 2
    private var privateDegisken = 3
    internal var internalDegisken = 4 // Modül demek
    protected var protectedDegisken = 5


   /* fun fonksiyon(){
        println(privateDegisken)
    }

    */
}

//protected kalıtımla alakalıdır
//protected'ı kullanabilmek için class'ı open yapıp,
// kalıtım oluşturacağım anlamına geliyor


//private 'i sınıf basına data yazıp set ve
// get methodlarını arka planda işleyebiliyoruz