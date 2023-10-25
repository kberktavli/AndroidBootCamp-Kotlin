package com.berktavli.kotlinlessons.nesne_tabanli_programlama.composition

/* Composition nedir ?
Bir sınıf türetilirken sadece bir sınıftan yararlanabiliriz.
Birden çok fazla sınıf kullanamayız.
Bu sebeple, ana sınıfın parçaları olan sınıflardan ana sınıf içinde nesneler oluştururuz.
Bunun sonucunda ise oluşturacağımız bir ana sınıf nesnesini kullanarak ve onun altındaki nesneleri kullana
-rak o sınıfın metotlarına ve değişkenlerine ulaşabiliriz. İşe yapılan bu işleme “Composition”,
Türkçe karşılığı ile “Kompozisyon” adı verilir.
 */
fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim kurgu")

    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christopher Nolan")

    val f1 = Filmler(1,"Django",2013,k1,y1)
    val f2 = Filmler(2,"Inception",2006,k2,y2)

    println("Film id : ${f1.film_id}")
    println("Film id : ${f1.film_ad}")
    println("Film id : ${f1.film_yil}")
    println("Film id : ${f1.kategori.kategori_ad}")
    println("Film id : ${f1.yonetmen.yonetmen_ad}")
}