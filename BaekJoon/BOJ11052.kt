import java.util.*
import kotlin.math.max

fun main(){
    val n = readLine()!!.toInt()
    val pay = readLine()!!.split(" ").map{it.toInt()}
    val list = IntArray(n + 1)
    
    for(i in 0 until pay.size){
        list[i + 1] = pay[i]
    }
    
    val dp = IntArray(n + 1){
        if(it == 1) list[1]
        else 0
    }
   
    for(i in 1..n){
        for(j in 1..i){
            dp[i] = max(dp[i], dp[i - j] + list[j])
        }
    }  
    
    println(dp[n])
}
