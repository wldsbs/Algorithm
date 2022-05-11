class Solution {
    fun solution(x: Int, n: Int): Array<Long> {
        return Array<Long>(n){i -> ((i+1) * x.toLong())}
        }
}