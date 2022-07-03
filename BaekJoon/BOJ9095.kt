import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()
    var x: Int
    
    var dp = IntArray(11)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    
    for(j in 1..n){
        x = sc.nextInt()
        
        for(i in 4..x){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
        }
        println(dp[x])
    }
}
