package array.deciding_on_temporary_president

import java.util.*


internal class Main {
    private val dx = intArrayOf(-1,0,1,0)
    private val dy = intArrayOf(0,1,0,-1)

    fun solution(n: Int, arr: Array<IntArray>): Int {
        var answer = 0
        var max = Int.MIN_VALUE
        for (i in 1 .. n){
            var cnt = 0
            for (j in 1 .. n){
                if (i != j){
                    for (k in 1 .. 5){
                        if (arr[i][k]==arr[j][k]){
                            cnt++
                            break
                        }
                    }
                }
            }
            if (cnt>max){
                max = cnt
                answer=i
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
            val arr = Array(n+1) { IntArray(6) }
            for (i in 1 until n) {
                for (j in 1 ..5) {
                    arr[i][j] = kb.nextInt()
                }
            }
            println(T.solution(n, arr))
        }
    }
}