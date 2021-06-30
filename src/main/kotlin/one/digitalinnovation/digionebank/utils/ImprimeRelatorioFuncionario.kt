package one.digitalinnovation.digionebank.utils

import one.digitalinnovation.digionebank.abstractions.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}