package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Valeria"
    var cpf: String = "123.456.789-10"
}

fun main(){
    val valeria = Pessoa()

    println(valeria.nome)
    println(valeria.cpf)
}