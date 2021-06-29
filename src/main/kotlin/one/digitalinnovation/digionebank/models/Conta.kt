package one.digitalinnovation.digionebank.models

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numeroConta: String,
    val saldo: BigDecimal
) {
    fun depositar(valor: BigDecimal) {
        
    }

    fun sacar(valor: BigDecimal) {

    }
}