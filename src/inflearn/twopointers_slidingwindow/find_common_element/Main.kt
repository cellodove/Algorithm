package inflearn.twopointers_slidingwindow.find_common_element

import java.util.*
import kotlin.collections.ArrayList


internal class Main {
    fun solution(n: Int, m: Int, a: Array<Int>,b: Array<Int>): ArrayList<Int> {
        var answer = arrayListOf<Int>()
        a.sort()
        b.sort()
        var p1 = 0
        var p2 = 0

        while (p1<n && p2<m){
            if (a[p1]==b[p2]){
                answer.add(a[p1++])
                p2++
            }else if (a[p1]<b[p2]){
                p1++
            }else{
                p2++
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
            val a = Array(n){0}
            for (i in 0 until n){
                a[i] = kb.nextInt()
            }
            val m = kb.nextInt()
            val b = Array(m){0}
            for (i in 0 until m){
                b[i] = kb.nextInt()
            }

            for (x in T.solution(n, m, a, b)){
                print("$x ")
            }

        }
    }
}