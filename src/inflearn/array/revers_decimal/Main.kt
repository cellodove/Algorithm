package inflearn.array.revers_decimal

import java.util.*


internal class Main {
    private fun isPrime(num : Int): Boolean{
        if (num==1){
            return false
        }
        for (i in 2 until num){
            if (num%i==0){
                return false
            }
        }
        return true
    }

    fun solution(n: Int,arr :ArrayList<Int>): ArrayList<Int> {
        val answer = arrayListOf<Int>()
        for (i in 0 until n){
            var tmp = arr[i]
            var res = 0
            while (tmp>0){
                val t = tmp%10
                res = res*10+t
                tmp /= 10
            }
            if (isPrime(res)){
                answer.add(res)
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
            val arr = arrayListOf<Int>()
            for (i in 0 until n){
                arr.add(kb.nextInt())
            }
            for (x in T.solution(n,arr)){
                print("$x ")
            }
        }
    }
}