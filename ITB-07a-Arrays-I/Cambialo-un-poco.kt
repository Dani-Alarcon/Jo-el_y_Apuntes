package `ITB-07a-Arrays-I`

import java.util.Scanner

fun main() {
    val lector = Scanner(System.`in`)
    val cas = lector.nextInt()
    repeat(cas) {
        val medida = lector.nextInt()
        val valors = IntArray(medida)

        for (i in 0 until medida) {
            valors[i] = lector.nextInt()
        }

        val p1 = lector.nextInt()
        val p2 = lector.nextInt()

        for (i in 0 until medida) {
            if (valors[i] == p1) {
                valors[i] = p2
            }
        }

        println(valors.joinToString(" "))
    }
}