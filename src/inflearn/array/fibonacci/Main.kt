package inflearn.array.fibonacci

import java.util.*
import kotlin.collections.ArrayList

class Main {
    fun solution(n : Int): ArrayList<Int> {
        var answer = arrayListOf<Int>()
        answer.add(1)
        answer.add(1)

        for (i in 2 until n){
            answer.add(answer[i-2] + answer[i-1])
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()

            for (x in T.solution(n)){
                print("$x ")
            }
        }
    }
}