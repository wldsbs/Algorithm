import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    
    var date = sc.nextLine()
    var car_list = sc.nextLine()!!.split(" ")
    
    var cnt = 0
    
    for(i in 0..4){
        if(car_list[i] == date ) { cnt++ }
    }
    println(cnt)
}