package string.text_distance

import java.util.*
import kotlin.collections.ArrayList
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String, t: Char): Array<Int> {
        var answer = Array(str.length) { 0 }
        var p = 1000

        for (i in str.indices){
            if (str[i]==t){
                p=0
                answer[i]=p
            }else{
                p++
                answer[i]=p
            }
        }
        p = 1000

        for (i in str.length-1..0){
            if (str[i]==t){
                p=0
            }else{
                p++
                answer[i]= answer[i].coerceAtMost(p)
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
            val t = kb.next()[0]
            T.solution(str,t).forEach { print(it) }
        }
    }
}