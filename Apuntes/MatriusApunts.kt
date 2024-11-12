package Apuntes

fun main(){
    val cars: Array<Array<String>>
    cars = Array(3) { arrayOf("Volvo", "BMW", "Ford", "Mazda") }
    //Recorrer la matriz, esta es por filas y columnas, sirve para todos los lenguajes
    for (f in 0 until cars.size)
        for (c in 0 until cars[f].size)
            println(cars[f][c])
    //Otra forma de recorrer la matriz, esta es por valores
    for (fila in cars)
        for (car in fila)
            print(car + " ")
}