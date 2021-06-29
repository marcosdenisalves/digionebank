package one.digitalinnovation.digionebank.main

import one.digitalinnovation.digionebank.models.Banco
import one.digitalinnovation.digionebank.models.Pessoa

fun main() {
    val bancoDigital = Banco(nome = "DigiOne", numero = 12)
    println(bancoDigital.nome)
    println(bancoDigital.numero)


    var bancoDigital2 = bancoDigital.copy(nome = "Santander", numero = 6)
    println(bancoDigital2.info())
}
