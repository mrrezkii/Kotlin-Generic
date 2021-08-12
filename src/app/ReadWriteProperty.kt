package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringLogReadProperty(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("You get data ${property.name} is $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }

}

class Person(param: String){
    var name:String by StringLogReadProperty(param)
}

fun main(){
    val person = Person("Rezki")

    println(person.name)

    person.name = "Nando"

    println(person.name)
}