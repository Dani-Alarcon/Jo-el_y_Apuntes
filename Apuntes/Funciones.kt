package Apuntes

import java.util.Scanner
import kotlin.math.pow

val LECTOR: Scanner = Scanner(System.`in`)

fun main() {
    var eleccio: Int = 0
    val MENU = "\nTria una opció: " +
            "\n1. Donar el quadrat d'un numero introduit. " +
            "\n2. Compara dos numeros per saber quin es el major i quin es el menor. " +
            "\n3. Calcular el volum d'una esfera." +
            "\n4. Fer diferents operacions amb dos numeros introduits." +
            "\n5. Introduir un numero positiu." +
            "\n6. Calcular el descompte d'un producte." +
            "\n7. Calcular percentatge de nois i noies que hi ha a l'aula." +
            "\n8. Calcular si has comprat una figura a bon preu per poder revendre-la." +
            "\n9. Sortir"

    do {
        println(MENU)
        eleccio = correctorEnter(missatge = "Tria una opcio: ")
        LECTOR.nextLine()
        when (eleccio) {
            1 -> {
                correctorEnter(missatge = "Introdueix un numero per saber el seu quadrat: ")
                cuadrat(num1 = LECTOR.nextInt())
            }

            2 -> {
                print("Introdueix dos numeros per saber quin es mayor, si el primer numero es mayor dira TRUE: ")
                val num1 = correctorEnter(missatge = "Introdueix el primer numero: ")
                val num2 = correctorEnter(missatge = "Introdueix el segon numero: ")
                mayorMenor(num1, num2)
            }

            3 -> {

                val radiEsfera: Float = correctorFloat(missatge = "Introdueix el volum per calcular el radi de l'esfera: ")
                println("El volum es: ${volumEsfera(radiEsfera)}")

            }

            4 -> {
                val SUBMENU = "\nTria una opció: " +
                        "\n1. Sumar. " +
                        "\n2. Restar. " +
                        "\n3. Multiplicar." +
                        "\n4. Dividir."
                var operacio: Int = 0
                do {
                    println("Introdueix dos numeros per fer operacions")
                    val num1 = correctorEnter(missatge = "Introdueix el primer numero: ")
                    val num2 = correctorEnter(missatge = "Introdueix el segon numero: ")
                    println(SUBMENU)
                    operacio = correctorEnter(missatge = "Tria una opcio: ")
                    when (operacio) {
                        1 -> {
                            val suma: Int = suma(num1, num2)
                            println("La suma es $suma")
                        }

                        2 -> {
                            val resta: Int = resta(num1, num2)
                            println("La suma es $resta")

                        }

                        3 -> {
                            val multiplicacio: Int = multi(num1, num2)
                            println("La suma es $multiplicacio")

                        }

                        4 -> {
                            if (num1!=0 || num2 != 0){
                                val divisio: Int = divisio(num1, num2)
                                println("La suma es $divisio")
                            }else{
                                println("No es pot dividir per zero")
                            }


                        }
                        else -> {
                            print("Opcio invalida ")
                        }
                    }
                }while (operacio < 0 || operacio > 4)
            }

            5 -> {
                print("Introdueix un numero per saber el seu quadrat: ")
                correctorEnter(missatge = "Introdueix un numero")
                positiu(num1 = LECTOR.nextInt())
            }

            6 -> {
                print("Introdueix un numero per saber el seu quadrat: ")
                correctorEnter(missatge = "Introdueix un numero")
                cuadrat(num1 = LECTOR.nextInt())
            }

            7 -> {
                print("Introdueix un numero per saber el seu quadrat: ")
                correctorEnter(missatge = "Introdueix un numero")
                cuadrat(num1 = LECTOR.nextInt())
            }
            8 -> {
                print("Introdueix un numero per saber el seu quadrat: ")
                correctorEnter(missatge = "Introdueix un numero")
                cuadrat(num1 = LECTOR.nextInt())

            }

            9 -> {
                print("Adeu")
                break
            }

            else -> {
                println("******************")
                println("Opcio invalida ")
                println("******************")
            }
        }
    } while (eleccio < 1 || eleccio > 9)

}

//Control d'errors
fun correctorEnter(missatge:String): Int {

    do {
        print(missatge)
        val valorCorrecte = LECTOR.hasNextInt()
        if (!valorCorrecte) {
            print("ERROR: Introdueix un número: ")
            LECTOR.nextLine()
        }
    } while (!valorCorrecte)
    var numero: Int = LECTOR.nextInt()
    return numero
}

fun correctorFloat(missatge:String): Float {
    do {
        print(missatge)
        val valorCorrecte = LECTOR.hasNextFloat()
        if (!valorCorrecte) {
            print("ERROR: Introdueix un número: ")
            LECTOR.nextLine()
        }
    } while (!valorCorrecte)
    var numero: Float = LECTOR.nextFloat()
    return numero
}

//1
fun cuadrat(num1: Int): Int {
    return num1 * num1
}

//2
fun mayorMenor(num1: Int, num2: Int): Boolean {
    var num1Mayor: Boolean = false
    when {
        num1 > num2 -> {
            println("$num1 es mayor que $num2")
            num1Mayor = true
        }
        num2 > num1 -> println("$num2 es mayor que $num1")
        num1 == num2 -> println("$num1 i $num2 son iguals")
    }
    println(num1Mayor.toString().uppercase())
    return num1Mayor
}

//3
fun volumEsfera(radi: Float): Float {
    val radiCubico: Float = radi.pow(3)
    return 4 / 3f * 3.14f * radiCubico
}

//4
fun suma(num1: Int, num2: Int): Int {

    return num1 + num2
}

fun resta(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun multi(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun divisio(num1: Int, num2: Int): Int {
    return num1 / num2
}

//5
fun positiu(num1: Int): Boolean {
    var positiu: Boolean = false
    if (num1 < 0) {
        println("Numero negatiu")
    } else {
        positiu = true
    }
    return positiu
}
