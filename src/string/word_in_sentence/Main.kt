package string.word_in_sentence

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): String {
        var answer = ""
        var s : List<String> = str.split(" ")

        var m = 0
        for (x in s){
            var len = x.length
            if (len>m){
                m = len
                answer = x
            }
        }
        println(m)
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