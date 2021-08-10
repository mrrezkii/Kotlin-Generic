package app

import data.MyData

fun main(){
    val myDataString: MyData<String, Int> = MyData<String, Int>("Rezki", 100)
    myDataString.printData()

    val myDataInt = MyData(25, "Nando")
    myDataInt.printData()
}