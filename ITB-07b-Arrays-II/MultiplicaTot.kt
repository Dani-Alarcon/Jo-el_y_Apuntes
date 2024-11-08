package `ITB-07b-Arrays-II`

import java.util.Scanner

fun main() {
    val LECTOR = Scanner(System.`in`)
    val CAS = LECTOR.nextInt()

    repeat(CAS) {
        val k = LECTOR.nextInt()
        val ARRAY = IntArray(k) { LECTOR.nextInt() }
        val pos = LECTOR.nextInt()

        val resultat = ARRAY.map { it * pos }
        println(resultat.joinToString(" "))
    }
}