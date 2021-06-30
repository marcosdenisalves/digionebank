package one.digitalinnovation.digionebank.utils

import one.digitalinnovation.digionebank.abstractions.Pessoa

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(pessoa: Pessoa) {
            println(
                pessoa.toString()
            )
        }
    }
}