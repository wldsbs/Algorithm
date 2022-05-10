class Solution {
    fun solution(x: Int): Boolean {
        var total = 0
        total = x.toString().map {
            it.toInt() - '0'.toInt()
        }.sum()
        
        if(x % total == 0) return true
        else return false
    }
}