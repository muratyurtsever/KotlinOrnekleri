fun main(args: Array<String>){

//DEĞİŞKENLER
    println("DEĞİŞKENLER")
    var ad = "murat"
    var soyad = "yurtsever"

    println("$ad $soyad")


    var takım = "fenerbahce"

    println("benim takımım: $takım")

    //if else
    println("  ")
    println("IF ELSE")


    var sayı1:Int =8
    var sayı2= 36
    var sonuc = 0


    sonuc=if (sayı1>sayı2)
        sayı1
    else if (sayı2>sayı1)
        sayı2
    else 0
        println("En büyük sayı $sonuc")



    var str1  ="Murat"
    var str2  ="Murat"

    if (str1 ==str2)
        println("Aynı")
    else println("farklı")



    var num1 =10
    var num2 =11

    if (num1>num2)
        println("numara 1 büyüktür $num1")
    else if (num1<num2)
        println("numara 2 büyüktür $num2")
    else println("eşittir.")

    //WHEN
    println("  ")
    println("WHEN")

    val x:Int = 7
    when(x){
        5 -> println("girilen sayı 5 tir")
        10 -> println("girilen sayı 10 dur")
        7 -> println("girilen sayı 7 dir")
        in 11..20 -> println("girilen sayı 11 ile 20 arasıdır")
        !in 21..30 -> println("girilen sayı 21 ile 30 arasıda değildir")  // olumsuz anlamı alır
        else -> println("bilinmeyen deger")
    }

    val nummare:Int= 105
    var cevap: String = when(nummare){
        10 ->"girilen sayı 10"
        100 ->"girilen sayı 10"
        else -> "bilinmeyen sayı"

    }
    println (cevap)
}