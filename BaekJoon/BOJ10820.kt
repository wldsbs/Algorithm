import java.util.*
import kotlin.math.*

fun main(){
    
    while(true){
        val input = readLine()
        val result = IntArray(4,{0})
        
        input ?: return
        
        input.forEach{ it ->
            if(it.toInt() > 96 && it.toInt() < 123){result[0]++}
            else if(it.toInt() > 64 && it.toInt() < 91){result[1]++}
            else if(it.toInt() > 47 && it.toInt() < 58){result[2]++} 
            else if(it.toInt() == 32){result[3]++}
        }
        
        for(i in 0..3){
            print(result[i].toString() + " ")
        }
        println()
    }
}