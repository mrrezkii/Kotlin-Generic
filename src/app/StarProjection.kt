package app

fun displayLenght(array: Array<*>){
    println("Total array is ${array.size}")
}

fun main(){
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Rezki", "Nando")

    displayLenght(arrayInt)
    displayLenght(arrayString)
}