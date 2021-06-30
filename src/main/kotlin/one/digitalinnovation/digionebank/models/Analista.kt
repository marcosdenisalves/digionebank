package one.digitalinnovation.digionebank.models

import one.digitalinnovation.digionebank.abstractions.Funcionario

class Analista (
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1
}