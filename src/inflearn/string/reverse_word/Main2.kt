package inflearn.string.reverse_word

import java.util.*
import kotlin.jvm.JvmStatic

class Main2 {
    fun solution(str: ArrayList<String>): ArrayList<String> {
        var answer = arrayListOf<String>()
        for (x in str){
            var s = x.toCharArray()
            var lt = 0
            var rt = x.length-1

            while (lt<rt){
                var tem = s[lt]
                s[lt] = s[rt]
                s[rt] = tem
                lt++
                rt--
            }
            var tem  = String(s)
            answer.add(tem)
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main2()
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