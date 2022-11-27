package inflearn.array.find_student

import java.util.*

class Main {
    fun solution(n : Int,arr: ArrayList<Int>): Int {
        var answer = 1
        var max = arr[0]

        for (i in 1 until n){
            if (arr[i]>max){
                answer++
                max = arr[i]
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