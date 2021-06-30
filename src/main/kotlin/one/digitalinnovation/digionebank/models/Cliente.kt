package one.digitalinnovation.digionebank.models

import one.digitalinnovation.digionebank.abstractions.Pessoa
import one.digitalinnovation.digionebank.enums.ClienteTipo
import one.digitalinnovation.digionebank.interfaces.Logavel

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "ASDW34F" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Cliente do tipo: ${clienteTipo.descricao}
    """.trimIndent()
}