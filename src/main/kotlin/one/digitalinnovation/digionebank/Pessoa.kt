package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Dênis"
    var cpf: String = "123.456.789-10"
    private set
}

fun main() {
    val denis = Pessoa()

    println(denis)
    println(denis.nome)
    println(denis.cpf)
}