package app

class Data<T>(val data: T)

fun Data<Int>.printInt(){
    val data: Int = this.data
    println(data)
}

fun Data<String>.printString(){
    val data: String = this.data
    println(data)
}

fun main(){
    val data1 = Data(1)
    val data2 = Data("Rezki")

    data1.printInt()
    data2.printString()
}