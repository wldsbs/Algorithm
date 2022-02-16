import java.util.*

fun main() {
    val input = readLine()!!.split(" ").map{it.toInt()}
    
    val a = input[0]
    val b = input[1]
    
    println(a*(b-1)+1)
}