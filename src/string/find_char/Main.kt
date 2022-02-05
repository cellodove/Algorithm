package string.find_char

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String, t: Char): Int {
        var str = str
        var t = t
        var answer = 0
        str = str.uppercase(Locale.getDefault())
        t = t.uppercaseChar()
        for (x in str.toCharArray()) {
            if (x == t) answer++
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val str = kb.next()
            val c = kb.next()[0]
            print(T.solution(str, c))
        }
    }
}