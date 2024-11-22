package `ITB-08a-Strings-I `

import java.util.Scanner
fun main(){
    val LECTOR: Scanner = Scanner(System.`in`)
    val CAS: Int = readln().toInt()
    repeat(CAS){
        val paraula:String = LECTOR.nextLine().lowercase()

        if (paraula.startsWith("p".lowercase())){
            if(paraula.contains(("patata".lowercase()))){
                println("Es Patata")
            } else {
                println("No es Patata")
            }
        }else {
            println("No es Patata")
        }
    }
}