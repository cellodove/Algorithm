package inflearn.array.find_big_number

import java.util.*
import kotlin.collections.ArrayList
import kotlin.jvm.JvmStatic

class Main {
    fun solution(n : Int,arr: ArrayList<Int>): ArrayList<Int> {
        var answer = arrayListOf<Int>()

        answer.add(arr[0])
        for (i in 1 until  n){
            if (arr[i]>arr[i-1]){
                answer.add(arr[i])
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
            for (x in T.solution(n,arr)){
                print("$x ")
            }
        }
    }
}