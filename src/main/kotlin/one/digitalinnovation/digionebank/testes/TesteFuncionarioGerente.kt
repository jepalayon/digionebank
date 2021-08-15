package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria do Carmo", cpf = "123654987-52", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
    }

