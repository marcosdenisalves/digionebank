package one.digitalinnovation.digionebank.main

import one.digitalinnovation.digionebank.enums.ClienteTipo
import one.digitalinnovation.digionebank.models.Banco
import one.digitalinnovation.digionebank.models.Pessoa

fun main() {
    ClienteTipo.values().forEach { x ->
        println("$x: ${x.descricao}")
    }

    val pf = ClienteTipo.PF
    println(pf.descricao)

    val pj = ClienteTipo.PJ
    println(pj.descricao)

}
