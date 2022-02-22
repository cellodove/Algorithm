package string.compression_string

import java.util.*
import kotlin.jvm.JvmStatic

class Main {
    fun solution(str: String): String {
        var answer = ""
        var s = str
        var cnt = 1
        s += " "
        println(s)
        for (i in s.indices){
            if ((i+1)!=s.length){
                if (s[i]==s[i+1]){
                    cnt ++
                }else{
                    answer+=s[i]
                    if (cnt>1){
                        answer+=cnt.toString()
                        cnt=1
                    }
                }
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