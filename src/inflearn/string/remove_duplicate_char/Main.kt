package inflearn.string.remove_duplicate_char

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): String {
        var answer = ""

        for (i in str.indices){
            //println("${str[i]} $i ${str.indexOf(str[i])}")
            if (str.indexOf(str[i])==i){
                answer += str[i]
            }
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val str = kb.nextLine()
            print(T.solution(str))
        }
    }
}