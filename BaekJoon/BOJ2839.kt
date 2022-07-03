import java.util.*
import kotlin.math.min

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var dp = IntArray(n + 1){
        if(it == 3 || it == 5) 1
        else -1
    }
    
    for(i in 6..n){
        var min = Int.MAX_VALUE
        
        if(dp[i - 3] != -1) min = min(min, dp[i - 3])
        if(dp[i - 5] != -1) min = min(min, dp[i - 5])
        
        if(min == Int.MAX_VALUE) dp[i] = -1
        else dp[i] = min + 1
    }
    println(dp[n])
}
