package string.reverse_word

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: ArrayList<String>): ArrayList<String> {
        var answer = arrayListOf<String>()
        for (x in str){
            answer.add(x.reversed())
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()
            val str  = arrayListOf<String>()

            for (i in 0 until n){
                str.add(kb.next())
            }

            for (i in 0 until n){
                println(T.solution(str)[i])
            }

        }
    }
}