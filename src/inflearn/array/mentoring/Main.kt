package inflearn.array.mentoring

import java.util.*


internal class Main {
    fun solution(n: Int, m: Int, arr: Array<IntArray>): Int {
        var answer = 0

        for (i in 1 .. n){
            for (j in 1 .. n){
                var cnt = 0
                for (k in 0 until m){
                    var pi = 0
                    var pj = 0
                    for (s in 0 until n){
                        if (arr[k][s]==i){
                            pi = s
                        }
                        if (arr[k][s]==j){
                            pj = s
                        }
                    }
                    if (pi<pj){
                        cnt++
                    }
                }
                if (cnt == m){
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
            val m = kb.nextInt()
            val arr = Array(m) { IntArray(n) }
            for (i in 0 until m) {
                for (j in 0 until n) {
                    arr[i][j] = kb.nextInt()
                }
            }
            println(T.solution(n, m, arr))
        }
    }
}