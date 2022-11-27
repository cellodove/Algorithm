package inflearn.array.maximum_sum_lattice_plates

import java.util.*


internal class Main {
    fun solution(n: Int, arr: Array<IntArray>): Int {
        var answer = -2147000000
        var sum1 = 0
        var sum2 = 0
        for (i in 0 until n) {
            sum2 = 0
            sum1 = sum2
            for (j in 0 until n) {
                sum1 += arr[i][j]
                sum2 += arr[j][i]
            }
            answer = answer.coerceAtLeast(sum1)
            answer = Math.max(answer, sum2)
        }
        sum2 = 0
        sum1 = sum2
        for (i in 0 until n) {
            sum1 += arr[i][i]
            sum2 += arr[i][n - i - 1]
        }
        answer = Math.max(answer, sum1)
        answer = Math.max(answer, sum2)
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