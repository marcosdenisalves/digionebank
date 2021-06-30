package one.digitalinnovation.digionebank.main

import one.digitalinnovation.digionebank.models.Analista
import one.digitalinnovation.digionebank.models.Gerente
import one.digitalinnovation.digionebank.utils.ImprimeRelatorioFuncionario


fun main() {
    val analista = Analista(
        nome = "Dênis Alves",
        cpf = "123.456.789-00",
        salario = 3600.00
    )

    val gerente = Gerente(
        nome = "Patricia Tereza",
        cpf = "876.543.321-00",
        salario = 6000.00
    )

    val funcionaios = listOf(analista, gerente)
    funcionaios.forEach() { funcionario ->
        ImprimeRelatorioFuncionario.imprime(funcionario)
        println()
    }
}