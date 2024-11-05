package `ITB-07a-Arrays-I`

import java.util.*

fun main() {
    val lector = Scanner(System.`in`).useLocale(Locale.ENGLISH)
    val tamany = lector.nextInt()
    val arrayPorcentajes = DoubleArray(tamany)

    for (i in 0 until tamany) {
        arrayPorcentajes[i] = lector.nextDouble() * 100
    }

    for (porcentaje in arrayPorcentajes) {
        print("${porcentaje}% ")
    }
}

