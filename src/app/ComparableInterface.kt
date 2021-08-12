package app

import data.Fruit

fun main(){
    val fruit1 = Fruit("Applle", 100)
    val fruit2 = Fruit("Applle", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}