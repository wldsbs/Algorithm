import java.util.*

fun main(args: Array<String>){
    var num =  readLine()!!.toInt()
    
    repeat(num){
        var count = 0
        var result = 0
        
        var input =  readLine()!!

        input.forEach{ i ->
             if(i == 'O'){
                 count++
                 result += count
             } 
             else {
                 count = 0
             }            
        }
        println(result) 
    }
}