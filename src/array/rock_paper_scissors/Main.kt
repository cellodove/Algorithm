package array.rock_paper_scissors

import java.util.*

class Main {
    fun solution(n : Int,a: ArrayList<Int>,b: ArrayList<Int>): String {
        var answer = ""
        for (i in 0 until n){
            answer += if (a[i]==b[i]){
                "D"
            }else if (a[i]==1 && b[i]==3){
                "A"
            }else if (a[i]==2 && b[i]==1){
                "A"
            }else if (a[i]==3 && b[i]==2){
                "A"
            }else{
                "B"
            }
        }
        return answer
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val T = Main()
            val kb = Scanner(System.`in`)
            val n = kb.nextInt()
            val a = arrayListOf<Int>()
            val b = arrayListOf<Int>()
            for (i in 0 until n){
                a.add(kb.nextInt())
            }
            for (i in 0 until n){
                b.add(kb.nextInt())
            }
            for (x in T.solution(n,a,b)){
                println(x)
            }
        }
    }
}