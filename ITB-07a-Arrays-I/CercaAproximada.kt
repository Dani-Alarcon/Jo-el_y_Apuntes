package `ITB-07a-Arrays-I`

import java.util.Scanner

fun main() {
    val lector = Scanner(System.`in`)
    val cas = lector.nextInt()

    repeat(cas) {
        val mida = lector.nextInt()
        val kTamany = IntArray(mida)

        for (x in 0 until mida) {
            kTamany[x] = lector.nextInt()
        }

        val m = lector.nextInt()

        val perMi = kTamany.any { it == m || it == m - 1 || it == m + 1 }

        if (perMi) {
            println("SI")
        } else {
            println("NO")
        }
    }
}
