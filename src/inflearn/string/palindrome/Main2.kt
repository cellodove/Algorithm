package inflearn.string.palindrome

import java.util.*
import kotlin.jvm.JvmStatic

class Main2 {
    fun solution(str: String): String {
        var answer = "YES"

        var str1 = str.uppercase(Locale.getDefault()).replace("[^A-Z]".toRegex(),"")
        var str2 = StringBuilder(str1).reverse().toString()
        println(str1)
        println(str2)
        if (str1 != str2){
            return "NO"
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main2()
            val kb = Scanner(System.`in`)
            val str = kb.nextLine()
            print(T.solution(str))
        }
    }
}