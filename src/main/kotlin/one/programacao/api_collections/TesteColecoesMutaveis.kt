package one.programacao.api_collections

fun main() {
    val joao = Funcionario(nome = "João", salarios= 2000.0, tipoContrato = "CLT" )
    val pedro = Funcionario(nome = "Pedro", salarios= 1500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salarios= 4000.0, tipoContrato = "CLT" )

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("===============================")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("===============================")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("============= Set ==================")
    val funcionariosSet = mutableSetOf(joao)
    //funcionariosSet.forEach { println(it) }

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }


}