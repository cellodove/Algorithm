package inflearn.array.find_ranking

import java.util.*
import kotlin.collections.ArrayList


internal class Main {
    fun solution(n: Int,arr :ArrayList<Int>):ArrayList<Int> {
        var answer = arrayListOf<Int>()

        for (i in 0 until n){
            var cnt = 1
            for (j in 0 until n){
                if (arr[j]>arr[i]){
                    cnt ++
                }
            }
            answer.add(cnt)
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
            for (x in T.solution(n,arr)){
                print("$x ")
            }

        }
    }
}