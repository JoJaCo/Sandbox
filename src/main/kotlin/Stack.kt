import java.util.Stack

fun main(args: Array<String>){
    var wifes = Stack<String>()  //created an empty stack that holds strings

    wifes.addAll(listOf("Julieta Venegas","Becky G",
        "Sandra Bullock","Megan Thee Stallion "))  //We added strings to the empty stack

    wifes.push("Karol G")









    //Print the stack 
    for (wife in wifes){
        println(wife)
    }
}