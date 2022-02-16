import java.util.*

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var burger_list = ArrayList<Int>()
    var juice_list = ArrayList<Int>()
    
    for(i in 0..2){
        burger_list.add(sc.nextInt())
    }
    
    for(i in 3..4){
        juice_list.add(sc.nextInt())
    }
    
    println(burger_list.minOrNull()!! + juice_list.minOrNull()!! - 50)
}