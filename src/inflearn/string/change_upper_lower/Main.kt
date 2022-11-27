package inflearn.string.change_upper_lower

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): String {
        var answer = ""
        for (x in str.toCharArray()) {
            answer += if (Character.isLowerCase(x)) {
                x.uppercaseChar()
            } else {
                x.lowercaseChar()
            }
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val str = kb.next()
            print(T.solution(str))
        }
    }
}