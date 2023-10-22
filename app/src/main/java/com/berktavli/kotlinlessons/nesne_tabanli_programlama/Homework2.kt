package com.berktavli.kotlinlessons.nesne_tabanli_programlama

class Homework2 {

    fun kmConverterToMph(enteredKm: Int): Double {
        return enteredKm * 0.621
    }

    fun alanHesapla(a: Int, b: Int) {
        println("Dikdörtgenin alanı : ${a * b}")
    }

    fun fakHesapla(a: Int): Int {
        var faktoriyel: Int = 1
        for (i in 1..a) {
            faktoriyel *= i
        }
        return faktoriyel
    }

    fun soru4(kelime: String) {
        var sayac = 0
        for (i in kelime) {
            if (i == 'e') {
                sayac += 1
            }
        }
        println("$kelime kelimesinde toplamda $sayac tane 'e' harfi bulunur")
    }

    //Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri gönderen metod
    //yazınız.
    //• İç açılar toplamı = ( (Kenar sayısı - 2) x 180 ) / Kenar sayısı
    fun soru5(kenarSayısı: Int): Int {
        return ((kenarSayısı - 2) * 180) / kenarSayısı
    }

    //Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    //yazınız.
    //• 1 günde 8 saat çalışılabilir.
    //• Çalışma saat ücreti : 40 ₺
    //• Mesai saat ücreti : 80 ₺
    //• 150 saat üzeri mesai sayılır

    fun soru6(workDay : Int) : Int{
        val workHour = workDay*8
        var maas = 0
        var mesaiMaas = 0
        if (workHour > 150){
            maas = (workHour-150)*80 +(150*40)
        }else{
            maas = workHour*40
        }

        return maas
    }

    fun soru7 (kalmaSuresi : Int): Int{
        var ucret = 0
        ucret = if (kalmaSuresi > 1){
            ((kalmaSuresi-1)*10)+50
        }else{
            50
        }

        return ucret
    }

}