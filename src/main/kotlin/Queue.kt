import java.util.LinkedList
import java.util.Queue

fun main(args: Array<String>){
    var cityQueue = LinkedList<String>()
    cityQueue.addAll(listOf("Bakersfield","San Diego","Texas","Spain"))

    for (city in cityQueue){
        println(city)
    }
    println()

    cityQueue.addLast("bakersfield")
    for (city in cityQueue){
        println(city)
    }
    println(cityQueue.isEmpty())



    
    while (!cityQueue.isEmpty()){
        println(cityQueue.removeFirst())
    }

    println(cityQueue.isEmpty())
}