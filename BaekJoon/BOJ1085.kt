import java.util.*
import kotlin.math.*

fun main(args: Array<String>){
    val rectangle = readLine()!!.split(" ").map{it.toInt()}
                                                
    val min_x = min(rectangle[0],rectangle[2]-rectangle[0])
    val min_y = min(rectangle[1],rectangle[3]-rectangle[1])
    val min = min(min_x,min_y)
    
    println(min)
}