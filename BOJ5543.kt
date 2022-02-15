import java.util.*

fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)
    var burger_list = ArrayList<Int>()
    burger_list.add(sc.nextInt())
    burger_list.add(sc.nextInt())
    burger_list.add(sc.nextInt())
    
    var burger_min = burger_list.minOrNull()!!

    var juice_list = ArrayList<Int>()
    juice_list.add(sc.nextInt())
    juice_list.add(sc.nextInt())

    var juice_min = juice_list.minOrNull()!!

    val set_price = burger_min + juice_min - 50
    
    println(set_price)
}