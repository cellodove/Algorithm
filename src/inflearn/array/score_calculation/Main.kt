package inflearn.array.score_calculation

import java.util.*


internal class Main {
    fun solution(n: Int,arr :ArrayList<Int>):Int {
        var answer = 0
        var cnt = 0

        for (i in 0 until n){
            if (arr[i]==1){
                cnt++
                answer+=cnt
            }else{
                cnt = 0
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
            val arr = arrayListOf<Int>()
            for (i in 0 until n){
                arr.add(kb.nextInt())
            }
            println(T.solution(n,arr))
        }
    }
}