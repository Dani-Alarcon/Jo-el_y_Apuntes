package Apuntes

import java.util.Scanner


fun main(){
    val LECTOR: Scanner = Scanner(System.`in`)
    var eleccio:Int = 0
    val MENU = "\nTria una opció: " +
            "\n1. Donar el quadrat d'un numero introduit. " +
            "\n2. Compara dos numeros per saber quin es el major i quin es el menor. " +
            "\n3. Calcular el radi d'una esfera." +
            "\n4. Fer diferents operacions amb dos numeros introduits." +
            "\n5. Introduir un numero positiu." +
            "\n6. Calcular el descompte d'un producte." +
            "\n7. Calcular si has comprat una figura a bon preu per poder revendre-la." +
            "\n8. Sortir"

    println(MENU)
    corrector()
    eleccio = LECTOR.nextInt()
    LECTOR.nextLine()
    when(eleccio){
        1 ->{
            println("Introdueix un numero per saber el seu quadrat")
            corrector()
            cuadrat(num1 = LECTOR.nextInt())
        }
    }


}
fun corrector() {
    val LECTOR: Scanner = Scanner(System.`in`)
    var valorCorrecte:Boolean = false
    do {
        valorCorrecte = LECTOR.hasNextInt()
        if (!valorCorrecte) {
            println("ERROR: Introdueix un número ")
            LECTOR.nextLine()
        }
    } while (!valorCorrecte)
}

//1
fun cuadrat(num1 :Int): Int {
    val resultat: Int
    resultat = num1 * num1
    println(resultat)
    return resultat
}