package one.programacao.api_collections

fun main(){
    val joao = Funcionario(nome = "João", salarios = 2000.0, tipoContrato = "CLT")
    val pedro = Funcionario(nome = "Pedro", salarios = 1500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salarios = 4000.0, tipoContrato = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("=================================================")
    repositorio.findAll().forEach { println(it) }

    println("=================================================")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}