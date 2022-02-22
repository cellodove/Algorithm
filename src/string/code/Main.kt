package string.code

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(n : Int,str: String): String {
        var answer = ""
        var s = str
        for (i in 0 until n){
            var tmp = s.substring(0,7).replace('#','1').replace('*','0')
            var num = tmp.toInt(2)
            println("$tmp $num")
            answer+=num.toChar()
            s = s.substring(7)
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()
            val str = kb.next()
            print(T.solution(n,str))
        }
    }
}