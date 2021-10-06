package one.programacao.api_collections

fun main() {
    val joao = Funcionario(nome = "João", salarios = 2000.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salarios = 1500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salarios = 4000.0, tipoContrato = "CLT")

    val funcionarios1 = listOf(joao, pedro)
    val funcionarios2 = listOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("======================================")

    val funcionarios3 = listOf(joao, pedro, maria)
    val  resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }
}