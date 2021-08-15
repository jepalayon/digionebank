package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario (
   nome: String,
   cpf: String,
   salario: BigDecimal
        ): Pessoa(nome, cpf) {
   protected abstract fun calculoauxilio()
}