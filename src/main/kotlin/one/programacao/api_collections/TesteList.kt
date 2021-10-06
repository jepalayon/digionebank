package one.programacao.api_collections

fun main(){
    val joao = Funcionario(nome = "João", salarios= 2000.0, tipoContrato = "CLT" )
    val pedro = Funcionario(nome = "Pedro", salarios= 1500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salarios= 4000.0, tipoContrato = "CLT" )

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)}

    println("=======================================")
    println(funcionarios.find { it.nome == "Maria" })

    println("=======================================")
    funcionarios
        .sortedBy { it.salarios }
        .forEach{ println(it)}

    println("=======================================")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach{ println(it)}

}


