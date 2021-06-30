package one.digitalinnovation.digionebank.services

import one.digitalinnovation.digionebank.interfaces.Logavel

class Autorizacao {
    fun autenticar(login: Logavel) = println("Autenticado: ${login.login()}")
}