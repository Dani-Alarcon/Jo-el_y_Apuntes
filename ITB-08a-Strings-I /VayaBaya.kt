package `ITB-08a-Strings-I `

import java.util.Scanner

fun main() {
    val LECTOR: Scanner = Scanner(System.`in`)
    val CAS: Int = readln().toInt()
    repeat(CAS) {
        val paraula: String = LECTOR.nextLine().lowercase()


        for (i in 0 until  paraula.length){
            if (paraula[i].toString().contains(("v".lowercase())) || paraula[i].toString().contains(("b".lowercase()))) {
                println(paraula.replace("v".lowercase() , "b".lowercase()).replace("b".lowercase(), "v".lowercase()))
            }
        }

        /*
        for (i in 0 until paraula.length){
            if (paraula[i].toString() == "v"){
                println(paraula.replace("v".lowercase() , "b".lowercase()))
            }else{
                if (paraula[i].toString() == "b"){
                    println(paraula.replace("b".lowercase() , "v".lowercase()))
                }
            }
        }*/

        /*
        if (paraula.contains(("v".lowercase()))) {
            println(paraula.replace("v".lowercase() , "b".lowercase()))
        } else {
            if (paraula.contains(("b".lowercase()))){
                println(paraula.replace("b".lowercase() , "v".lowercase()))
            }
        }*/
    }
}