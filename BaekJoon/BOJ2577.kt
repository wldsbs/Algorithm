import java.util.*

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var value = 1
    var result = ArrayList<Int>()
    
    for(i in 0..2){
        value *= sc.nextInt()
    }
    
    while(value > 0){
        result.add(value % 10)
        value = value / 10
    }
    
    for(i in 0..9){
        println(result.count(){it == i})
    }   
}