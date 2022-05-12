class Solution {
    fun solution(arr: IntArray): Array<Int> {
        var answer = mutableListOf<Int>()
        
        if(arr.size == 1) {
            answer.add(-1)
            return answer.toTypedArray()
        }
        var min = arr[0]
        
        arr.forEach{
            if(min > it) min = it
        }
        
    
        
        for(i in 0 until arr.size){
            if(arr[i] != min){
                answer.add(arr[i])
            }
        }
        
        println(min)
        
        return answer.toTypedArray()
    }
}