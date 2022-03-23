package array.mountain_peak

import java.util.*


internal class Main {
    private val dx = intArrayOf(-1,0,1,0)
    private val dy = intArrayOf(0,1,0,-1)

    fun solution(n: Int, arr: Array<IntArray>): Int {
        var answer = 0
        for (i in 0 until n){
            for (j in 0 until n){
                var flag = true
                for (k in 0 until 4){
                    val nx = i + dx[k]
                    val ny = j + dy[k]
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false
                        break
                    }
                }
                if (flag){
                    answer++
                }
            }
        }
        return answer
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()
            val arr = Array(n) { IntArray(n) }
            for (i in 0 until n) {
                for (j in 0 until n) {
                    arr[i][j] = kb.nextInt()
                }
            }
            print(T.solution(n, arr))
        }
    }
}