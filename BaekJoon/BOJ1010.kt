import java.util.*

fun main(){
    var dp = Array(30){IntArray(30)}
    
    val sc: Scanner = Scanner(System.`in`)
    val T = sc.nextInt() 
    
    dp[0][0] = 1
    for(j in 1 until 30){
        dp[j][0] = 1
        for(k in 1..j){
            dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k]
        }
    }
    
    repeat(T){
        var N = sc.nextInt()
        var M = sc.nextInt()
        
        println(dp[M][N])
    } 
}
