package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista(nome = "João Pedro", cpf = "123654987-52", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
    }

