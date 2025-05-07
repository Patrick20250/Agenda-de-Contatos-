package desafios

import androidx.annotation.StringRes
import funcoes.nome

open class SrHumano(
    // Propriedades
    var nome: String = "",
    var idade: Int = 0,
    var tamanho: Double = 0.0,
    var peso: Double = 0.0

){




fun correr() = println("Correndo")
fun caminhar() = println("Caminhando")
}


class Homem(nome: String,idade: Int,tamanho: Double,peso: Double): SrHumano(nome,idade,tamanho,peso){

    init {
        println(" Homem Criado nome:$nome idade:$idade")
    }




}

class Mulher (nome: String,idade: Int,tamanho: Double,peso: Double): SrHumano(nome,idade,tamanho,peso){

    init {
        println("Mulher criada nome:$nome idade:$idade")
    }

}

fun main() {

   println("Voce quer criar um Homem ou uma Mulher")
    val tipo = readLine()?: ""

    println("Nome:")
    val nome = readLine()?:""

    println("idade:")
    val idade = readLine()?.toIntOrNull()?: 0

    println("peso:")
    val peso = readLine()?.toDouble()?: 0.0

    println("tamanho:")
    val tamanho = readLine()?.toDouble()?: 0.0


    val pessoa = when(tipo){
        "homem"-> Homem(nome,idade, tamanho ,peso)
        "mulher" -> Mulher(nome,idade,peso,peso)
        else -> {
            println("Tipo Invalido. Criando como um SrHumano generico")
            SrHumano(nome,idade,tamanho,peso)
        }


    }

    pessoa.correr()
    pessoa.caminhar()


}