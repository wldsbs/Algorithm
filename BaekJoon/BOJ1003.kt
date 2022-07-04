import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    val T = sc.nextInt()
    
    var dp = Array(41){IntArray(2){0}}
    dp[0][0] = 1
    dp[1][1] = 1
    
    for(i in 1..T){
        var n = sc.nextInt()
        
        for(j in 2..n){
            dp[j][0] = dp[j - 1][0] + dp[j - 2][0]
            dp[j][1] = dp[j - 1][1] + dp[j - 2][1] 
        }
        println("${dp[n][0]} ${dp[n][1]}")
    }  
}
