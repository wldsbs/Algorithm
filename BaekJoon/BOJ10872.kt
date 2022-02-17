import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    
    var input = sc.nextInt()
    var result = 1
    
    for(i in 1..input){
        result = result * i
    }
    println(result)
}