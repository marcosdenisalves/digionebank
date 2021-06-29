package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Dênis"
    var cpf: String = "123.456.789-10"

    inner class Endereco {
        var rua: String = "Rua 17 de Abril"
    }
}

fun main() {
    val denis = Pessoa()

    println(denis.nome)
    println(denis.cpf)

    println(denis.Endereco().rua)
}