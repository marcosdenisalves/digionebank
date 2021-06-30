package one.digitalinnovation.digionebank.main

import one.digitalinnovation.digionebank.enums.ClienteTipo
import one.digitalinnovation.digionebank.interfaces.Logavel
import one.digitalinnovation.digionebank.models.Analista
import one.digitalinnovation.digionebank.models.Cliente
import one.digitalinnovation.digionebank.models.Gerente
import one.digitalinnovation.digionebank.services.Autorizacao
import one.digitalinnovation.digionebank.utils.ImprimeRelatorioFuncionario


fun main() {
    val analista = Analista(
        nome = "Dênis Alves",
        cpf = "123.456.789-00",
        salario = 3600.00
    )

    val gerente = Gerente(
        nome = "Patricia Tereza",
        cpf = "876.543.321-01",
        salario = 6000.00,
        senha = "XDS512D"
    )

    val cliente = Cliente(
        nome = "Cachorrinha",
        cpf = "324.321.321-02",
        clienteTipo = ClienteTipo.PF,
        senha = "ASDW34F"
    )

    val pessoas = listOf(analista, gerente, cliente)
    pessoas.forEach() { pessoa ->
        ImprimeRelatorioFuncionario.imprime(pessoa)
        if (pessoa is Logavel)
            Autorizacao().autenticar(pessoa)

        println()
    }
}