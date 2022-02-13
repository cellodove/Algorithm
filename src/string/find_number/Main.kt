package string.find_number

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): Int {
        var answer = 0

        for (x in str.toCharArray()){
            if (x.code in 48..57){
                answer = answer*10 + (x.code-48)
            }
        }
        return answer
    }

    fun solution2(str: String): Int {
        var answer = ""

        for (x in str.toCharArray()){
            if (x.isDigit()){
                answer += x
            }
        }
        return answer.toInt()
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val str = kb.next()
            print(T.solution2(str))
        }
    }
}