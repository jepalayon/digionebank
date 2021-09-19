package one.programacao.api_collections

fun main() {
    val values = IntArray(size = 5)

    values[0] = 1
    values[1] = 7
    values[2] = 9
    values[3] = 5
    values[4] = 3

    for (valor in values){
        println(valor)
    }
    println("====================================")

    values.forEach {
        println(it)
    }

    println("====================================")
    values.sort()
    for (valor in values)
        println(valor)
}