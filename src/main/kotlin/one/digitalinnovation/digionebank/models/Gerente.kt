package one.digitalinnovation.digionebank.models

import one.digitalinnovation.digionebank.abstractions.Funcionario
import one.digitalinnovation.digionebank.interfaces.Logavel

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {

    override fun calculoAuxilio(): Double {
        return salario * 0.5
    }

    override fun login(): Boolean = "XDS512D" == senha
}