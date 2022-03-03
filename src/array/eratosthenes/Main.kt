package array.eratosthenes

import java.util.*

internal class Main {
    fun solution(n: Int): Int {
        var cnt = 0
        val ch = IntArray(n + 1)
        for (i in 2..n) {
            if (ch[i] == 0) {
                cnt++
                var j = i
                while (j <= n) {
                    ch[j] = 1
                    j += i
                }
            }
        }

        return cnt
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()
            println(T.solution(n))
        }
    }
}