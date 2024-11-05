package Apuntes
/*
* @author: Dani Alarcon
*
* Arrays
*/
fun main(){


    val nombre = "Dani"
    val apellido = "Alarcon"
    val edad = "18"

    //Creación de un Array

    val pruebaArray: ArrayList<String> = arrayListOf()

    //Añadir datos de uno en uno, puede haber datos repetidos

    pruebaArray.add(nombre)
    pruebaArray.add(apellido)
    pruebaArray.add(edad)

    println("Los datos que hay dentro del Array son: $pruebaArray")

    //Añadir conjunto de datos

    pruebaArray.addAll(listOf("Hola", "esto es una prueba de los arrays"))
    println("Los datos que hay dentro del Array son: $pruebaArray. Se han añadido 2 nuevas posiciones")

    //Acceder a los datos del array

    val miNombre :String = pruebaArray[0]
    println("Mi nombre es: $miNombre")

    //Modificar datos del array

    pruebaArray[4] = "Se han modificado los datos del array"
    println("Ahora los datos que hay en el Array son: $pruebaArray")

    //Borrar datos

    pruebaArray.removeAt(3)
    println("Se ha borrado un elemento del Array: $pruebaArray")

    //Recorrer los datos, pasa por los datos de uno en uno
    pruebaArray.forEach {
        //hace lo que haya dentro tantas veces como posiciones haya en total
        println(it)

    }
    //Otras operaciones

    //Cuenta el numero de posiciones que hay
    println(pruebaArray.count())
    //Elimina todos los datos del Array pruebaArray.clear()


}