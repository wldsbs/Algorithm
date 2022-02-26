import java.util.*

fun main() {
    var charge = 1000 - readLine()!!.toInt()
    var count = 0
    
    while(charge > 0){
        if(charge / 500 > 0){
            charge = charge - 500
            count++
        }
        else if(charge / 100 > 0){
            charge = charge - 100
            count++
        }
        else if(charge / 50 > 0){
            charge = charge - 50
            count++            
        }
        else if(charge / 10 > 0){
            charge = charge - 10
            count++            
        }
        else if(charge / 5 > 0){
            charge = charge - 5
            count++            
        }
        else{
            charge = charge -1
            count++
        }
    }
    
    println(count)
}