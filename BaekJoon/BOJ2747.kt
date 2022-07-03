import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()    
    var dp = IntArray(n + 1){i -> i}
    for(i in 2..n){
        dp[i] = dp[i - 1] + dp[i - 2]
    } 
    println(dp[n])
}
