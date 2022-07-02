import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()    
    var dp = IntArray(n + 1){
        if(it == 0) 0
        else if(it == 1) 1
    }  
    
    for(i in 2..n){
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    println(dp[n])
}
