package com.berktavli.kotlinlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//eğer parantez varsa bunun inheritance yani kalıtım olduğunu anlayabiliriz,
// parantez yoksa bunun bir interface olduğunu anlayabiliriz
class MainActivity : AppCompatActivity() {
    var str1 : String? = null // direkt null dedik
    lateinit var str2: String //lateinit : daha sonra initialize edecegim demek, val ile kullanılmaz.
    //lateinit variable = degişken , value = değer , daha sonra değiştirilebilen bir tarzda olması lazım.
    //val olursa kitlemiş oluyoruz, daha sonra değerini değiştiremiyoruz.

    //lateinit var sayi : Int // lateinit var primitive types'lerde kullanılmıyor. örn: int, double , float
    var sayi : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"


    }
}