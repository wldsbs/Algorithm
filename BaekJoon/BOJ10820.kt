import java.util.*
import kotlin.math.*

fun main(){
    
    while(true){
        val input = readLine() ?: return
        val result = IntArray(4,{0})
                
        input.forEach{ it ->
            when(it){
                in 'a'..'z' -> result[0]++
                in 'A'..'Z' -> result[1]++
                in '0'..'9' -> result[2]++
                ' ' -> result[3]++
            }
        }

        for(i in 0..3){
            print(result[i].toString() + " ")
        }
        println()
    }
}