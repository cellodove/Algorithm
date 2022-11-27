package inflearn.string.find_word_and_reverse

import java.util.*

class Main {
    fun solution(str: String): String {
        var answer = ""

        val s = str.toCharArray()
        var lt = 0
        var rt = str.length-1

        while (lt<rt){
            if (!s[lt].isLetter()){
                lt++
            }else if(!s[rt].isLetter()){
                rt--
            }else{
                val tem = s[lt]
                s[lt] = s[rt]
                s[rt] = tem
                lt++
                rt--


            }
        }

        answer = String(s)
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val str  = kb.next()

            println(T.solution(str))


        }
    }
}