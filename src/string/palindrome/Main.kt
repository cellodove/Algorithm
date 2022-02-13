package string.palindrome

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): String {
        var answer = "YES"
        var str = str.uppercase(Locale.getDefault())
        for (i in str.indices){
            if (str[i]!=str[str.length-i-1]){
                return "NO"
            }
        }
        return answer
    }

    fun solution2(str: String): String {
        var answer = "YES"
        var str2 = StringBuilder(str).toString()
        if (str != str2){
            return "NO"
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