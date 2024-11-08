package `ITB-07b-Arrays-II`

import java.util.Scanner

fun main() {
    val LECTOR = Scanner(System.`in`)
    val CAS = LECTOR.nextInt()

    repeat(CAS) {
        val k = LECTOR.nextInt()
        val vot = IntArray(k) { LECTOR.nextInt() }

        val votsMaxims = vot.maxOrNull() ?: 0
        val guanyador = vot.indexOf(votsMaxims) + 1

        println(guanyador)
    }
}
