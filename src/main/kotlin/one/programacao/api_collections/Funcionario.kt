package one.programacao.api_collections

data class Funcionario(
    val nome: String,
    val salarios: Double,
    val tipoContrato: String
){
    override fun toString(): String =
        """
            Nome:     $nome
            Salario:  $salarios
        """.trimIndent()
}
