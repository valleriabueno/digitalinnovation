package one.digitalinnovation.collections

class Pessoa {
    var nome: String = "Valeria"
    var cpf: String = "123.456.789-10"
    private set
    //Modificador de visibilidade: private impede tanto a visualização quanto a reatribuição, private set impede apenas a reatribuição.
}

fun main(){
    val valeria = Pessoa()

    println(valeria.nome)
    println(valeria.cpf)
}