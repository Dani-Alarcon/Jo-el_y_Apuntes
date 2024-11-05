package `ITB-07a-Arrays-I`

import java.util.Scanner

fun main() {
    val lector: Scanner = Scanner(System.`in`)

    //Medida es el numero de posiciones
    val medida: Int = lector.nextInt()
    val k: IntArray = IntArray(medida)

    for (x in 0 until medida) {
        k[x] = lector.nextInt()
    }

    val N: Int = lector.nextInt()

    for (x in 0 until medida) {
        //Se le suma el numero que se ha introducido(N) a los que ya habia en k
        k[x] += N
    }

    println(k.joinToString(" "))
}