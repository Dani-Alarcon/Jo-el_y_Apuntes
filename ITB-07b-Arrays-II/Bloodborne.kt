package `ITB-07b-Arrays-II`

import java.util.Scanner

fun main() {
    val LECTOR = Scanner(System.`in`)
    val CAS = LECTOR.nextInt()

    repeat(CAS) {
        val k = LECTOR.nextInt()
        val ARRAY = IntArray(k) { LECTOR.nextInt() }

        var elementSeguit = false
        for (i in 0 until k - 1) {
            if (ARRAY[i] == ARRAY[i + 1]) {
                elementSeguit = true
            }
        }

        if (elementSeguit) {
            println("SI")
        } else {
            println("NO")
        }
    }
}

