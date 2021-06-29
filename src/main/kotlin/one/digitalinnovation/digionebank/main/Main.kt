package one.digitalinnovation.digionebank.main

import one.digitalinnovation.digionebank.enums.ClienteTipo
import one.digitalinnovation.digionebank.models.Banco
import one.digitalinnovation.digionebank.models.Funcionario
import one.digitalinnovation.digionebank.models.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa = Funcionario(
        nome = "Marcos Dênis",
        cpf = "132.323.231-22",
        salario = BigDecimal(3600.00)
    )

    println("${pessoa.nome}\n${pessoa.cpf}")
}
