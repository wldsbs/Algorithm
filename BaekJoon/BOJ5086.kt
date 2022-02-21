import java.util.*

fun main() {
     while(true){
        var input = readLine()!!.split(" ").map{it.toInt()}
        if(input[0] == 0 && input[1] == 0) break
        
        if(input[0] > input[1]){
            if(input[0] % input[1] ==0) {
                println("multiple")
            } else {
                println("neither")
            }
        } else{
            if(input[1] % input[0] ==0) {
                println("factor")
            } else {
                println("neither")
            }
        } 
    }
}