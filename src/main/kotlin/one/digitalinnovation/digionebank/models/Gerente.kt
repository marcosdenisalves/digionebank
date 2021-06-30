package one.digitalinnovation.digionebank.models

import one.digitalinnovation.digionebank.abstractions.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun calculoAuxilio(): Double {
        return salario * 0.5
    }
}